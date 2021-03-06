// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier.exceptions;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;

public class SimpleCommandExceptionType implements CommandExceptionType
{
    private final Message message;
    
    public SimpleCommandExceptionType(final Message message) {
        this.message = message;
    }
    
    public CommandSyntaxException create() {
        return new CommandSyntaxException(this, this.message);
    }
    
    public CommandSyntaxException createWithContext(final ImmutableStringReader reader) {
        return new CommandSyntaxException(this, this.message, reader.getString(), reader.getCursor());
    }
    
    @Override
    public String toString() {
        return this.message.getString();
    }
}
