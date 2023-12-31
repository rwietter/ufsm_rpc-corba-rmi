/* msg_sv.c: server implementation of PRINTMESSAGE */
/* procedure for MESSAGEPROC program */
#include <stdio.h>
#include "msg.h" /* msg.h generated by rpcgen */

int *printmessage_1_svc(char **msg, struct svc_req *req)
{
  static int result; /* must be static! */
  FILE *f;
  f = fopen("/dev/console", "w");
  if (f == (FILE *)NULL)
  {
    result = 0;
    return (&result);
  }
  fprintf(f, "%s\n", *msg);
  fclose(f);
  
  // Allocate memory for the result message
  char *res_msg = strdup("Message printed successfully.");
  *msg = res_msg;

  result = 1;
  return (&result);
}
