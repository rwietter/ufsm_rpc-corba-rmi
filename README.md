# RPC

Para compilar o código fonte, execute o comando:

```bash
gcc -o servidor servidor.c msg_svc.c -lnsl -ltirpc # Servidor
gcc -o cliente cliente.c msg_clnt.c -lnsl -ltirpc # Cliente
```

Libraries necessárias:

```bash
sudo pacman -S libtirpc rpcbind rpcsvc-proto
```