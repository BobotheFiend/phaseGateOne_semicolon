def text_display(names):
    name_length = len(names)

    if (name_length == 0 ):
        return "no one likes this"
        
    elif(name_length == 1):
        return (f"{names[0]} likes this}")

    elif(name_length == 2):
        return (f"{names[0]} and {names[1]} likes this}");
        
    elif(name_length == 3):
        return (f"{names[0]}, {names[1]} and {names[2]} likes this}");
        
    elif(name_length >= 4):
        return (f"{names[0]}, {names[1]} and {names_length - 2} likes this}");
        }
    return null;
