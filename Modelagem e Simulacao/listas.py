import time
 
lista_caixa = [6,4,6,8,2,4,2]

#print(lista_caixa)
temp = 0
tempoP = 0
#for i in range(len(lista_caixa)):
#    p = lista_caixa.pop()
#    v = p/2
#    temp = temp + v
#    print("atendendo",p," id:",i+1, "tempo parcial: ", temp)
#    time.sleep(v)
def servidorAtendendo1(p,id,temp):
    temp = v = p/2
    #temp = temp + v
    print("atendendo servidor(1) ",p," id:",id)
    time.sleep(v)
    return temp

def servidorAtendendo2(p,id,temp):
    temp = v = p/4
    #temp = temp + v
    print("atendendo servidor(2)",p," id:",id)
    time.sleep(v)
    return temp


for i in range(len(lista_caixa)):
    if len(lista_caixa) > 0:
        pri = lista_caixa.pop()
        print("pri",pri)
        t = servidorAtendendo1(pri,id,temp)
        tempoP += t
        print("tempoP ",t)
    
        
    if len(lista_caixa) > 0:
        segu = lista_caixa.pop()
        print("segun",segu)
        t = servidorAtendendo2(segu,id,temp)
        tempoP += t
        print("tempoP ",t)
    
    

        

    
    



    
    