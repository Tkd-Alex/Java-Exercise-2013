#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{int vet[100], i,n,e;
bool trovato;
cout<<"inserisci la dimensione"<<endl;
cin>>n;
//caricamento del vettore
for(i=0;i<n;i++){
    cout<<"inserisci elemento del vettore"<<endl,
    cin>>vet[i];}
//ricerca parziale
cout<<"inserisci elemento da cercare"<<endl;
cin>>e;
i=0;
trovato= false;
while((trovato==false)&& (i<n)){
if(vet[i]==e )
trovato=true;
i++;
}
if (trovato)
cout<<"elemento trovato in posizione "<<i-1<<endl;
else
cout<<"elemento non trovato"<<endl;
    system("PAUSE");	
  return 0;
}
