listahan_q = []
def add_item(lagay_aq):
    listahan_q.append(lagay_aq)
    print("    ೀ⋆⑅˚item added to the list !!\n")

def remove_item(alis_aq):
    if alis_aq not in listahan_q:
        print("    ೀ⋆⑅˚item not in list !! try again ~\n")
    else:
        listahan_q.remove(alis_aq)
        print("    ೀ⋆⑅˚item removed from the list !!\n")

def check_item():
    print(f"    ೀ⋆⑅˚current items on the list: {listahan_q}\n")

print("✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚")
print("✧    list processing program      ˚")
print("✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚✧˚ ༘ ⋆｡ ˚\n")

while True:
    try:
        print("select a process ʚ(｡˃ ᵕ ˂ )ɞ")
        print("୨୧ 1. add")
        print("୨୧ 2. remove")
        print("୨୧ 3. check")
        print("enter any key to 'exit'\n")
        action = input("♡ ˚₊‧⁺˖enter an action: ")

        assert action in ['1', '2', '3'], "ೀ⋆⑅˚ program terminated. thanks !! xoxo ೀ⋆⑅˚"
        if action == '1':
            lagay = input("♡ ˚₊‧⁺˖enter item: ")
            add_item(lagay)
        elif action == '2':
            alis = input("♡ ˚₊‧⁺˖enter item: ")
            remove_item(alis)
        else:
            check_item()
    except AssertionError as e:
        print(e)
        break