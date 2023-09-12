# RPC

Para compilar o código fonte, execute o comando:

```bash
gcc -o servidor servidor.c msg_svc.c -lnsl -ltirpc # Servidor
gcc -o cliente cliente.c msg_clnt.c -lnsl -ltirpc # Cliente
```

Libraries necessárias:

```bash
sudo pacman -S libtirpc rpcbind rpcsvc-proto rpcgen
```

Para gerar o arquivo `msg.h` e `msg_clnt.c` execute o comando:

```bash
rpcgen msg.x
```

No CORBA, para compilar a interface IDL, execute o comando:

```bash
idlj -fall msg.idl # Fall implementa o (Portable Object Adapter)
```