// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier.exceptions;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import java.util.function.Function;

public class DynamicCommandExceptionType implements CommandExceptionType
{
    private final Function<Object, Message> function;
    
    public DynamicCommandExceptionType(final Function<Object, Message> function) {
        this.function = function;
    }
    
    public CommandSyntaxException create(final Object arg) {
        return new CommandSyntaxException(this, this.function.apply(arg));
    }
    
    public CommandSyntaxException createWithContext(final ImmutableStringReader reader, final Object arg) {
        return new CommandSyntaxException(this, this.function.apply(arg), reader.getString(), reader.getCursor());
    }
}
