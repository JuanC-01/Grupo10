def Hanoi (n, TorreIni,TorreAux,TorreDest):
    if n == 1:
        print ("Mover disco de Torre "+ TorreIni+ " Torre "+ TorreDest)
    else:
        Hanoi(n-1, TorreIni, TorreDest, TorreAux)
        print ("Mover disco de Torre "+ TorreIni+ " Torre "+ TorreDest)
        Hanoi(n-1, TorreAux, TorreIni, TorreDest)

def hanoi(n):
    Hanoi(n, "1", "2", "3")

def main():
    n = eval(input("Digite cantidad de Discos "))
    print("----------------------------------")
    Hanoi(n, "1", "2", "3")

if __name__ == '__main__': main()