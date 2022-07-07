// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.NotNull;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ULong;
import java.util.Iterator;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0002H\u0086\u0002\u00f8\u0001\u0000J\u0010\u0010\u0005\u001a\u00020\u0002H&\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "Lkotlin/collections/ULongIterator;", "", "Lkotlin/ULong;", "()V", "next", "nextULong", "()J", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public abstract class ULongIterator implements Iterator<ULong>, KMappedMarker
{
    @NotNull
    @Override
    public final ULong next() {
        return ULong.box-impl(this.nextULong());
    }
    
    public abstract long nextULong();
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
