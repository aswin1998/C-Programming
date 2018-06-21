#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int num,i,j,k;
    struct node *next;
};
void create(struct node **);
void reverse(struct node **);
void display(struct node *);

void reverse(struct node **head)
{
    struct node *p, *q, *r;
 
    p = q = r = *head;
    p = p->next->next;
    q = q->next;
    r->next = NULL;
    q->next = r;
 
    while (p != NULL)
    {
        r = q;
        q = p;
        p = p->next;
        q->next = r;
    }
    *head = q;
}
 
void create(struct node **head)
{
    int i,ch,u;
    struct node *temp, *rear;
 
    do
    {
         int a[u];
         printf("Enter number\n");
        scanf("%d",&u);
        for(i=0;i<u;i++)
        {
        	scanf("%d",&a[i]);
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = a[i];
        temp->next = NULL;
        if (*head == NULL)
        {
            *head = temp;
        }
        else
        {
            rear->next = temp;
        }
        rear = temp;
       
        
    
}
 }while (i!=u );
    printf("\n");
        
        }
 
void display(struct node *p)
{
    while (p != NULL)
    {
        printf("%d-->", p->num);
        p = p->next;
    }
    printf("NULL");
}
 
int main()
{
    struct node *p = NULL;
    int n;
 	create(&p);
  	reverse(&p);
    display(p);
    return 0;
}
