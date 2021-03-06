// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import kotlin.TypeCastException;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import java.util.Map;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0088\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*" }, d2 = { "Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib" })
@SinceKotlin(version = "1.1")
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker
{
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;
    public static final Companion Companion;
    
    @Override
    public boolean containsKey(final Object key) {
        return this.implFindEntry(key) != null;
    }
    
    @Override
    public boolean containsValue(final Object value) {
        final Iterable $this$any$iv = this.entrySet();
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Entry it = (Entry)element$iv;
                final int n = 0;
                if (Intrinsics.areEqual(it.getValue(), value)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public final boolean containsEntry$kotlin_stdlib(@Nullable final Entry<?, ?> entry) {
        if (!(entry instanceof Entry)) {
            return false;
        }
        final Object key = entry.getKey();
        final Object value = entry.getValue();
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        }
        final Object ourValue = this.get(key);
        if (Intrinsics.areEqual(value, ourValue) ^ true) {
            return false;
        }
        if (ourValue == null) {
            if (this == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
            if (!this.containsKey(key)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        if (this.size() != ((Map)other).size()) {
            return false;
        }
        final Iterable $this$all$iv = ((Map)other).entrySet();
        final int $i$f$all = 0;
        boolean b;
        if ($this$all$iv instanceof Collection && ((Collection)$this$all$iv).isEmpty()) {
            b = true;
        }
        else {
            for (final Object element$iv : $this$all$iv) {
                final Entry it = (Entry)element$iv;
                final int n = 0;
                if (!this.containsEntry$kotlin_stdlib(it)) {
                    b = false;
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    @Nullable
    @Override
    public V get(final Object key) {
        final Entry<K, V> implFindEntry = this.implFindEntry((K)key);
        return (implFindEntry != null) ? implFindEntry.getValue() : null;
    }
    
    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public int getSize() {
        return this.entrySet().size();
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @NotNull
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = (Set<? extends K>)new AbstractMap$keys.AbstractMap$keys$1(this);
        }
        final Set<? extends K> keys = this._keys;
        if (keys == null) {
            Intrinsics.throwNpe();
        }
        return (Set<K>)keys;
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.getKeys();
    }
    
    @NotNull
    @Override
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.entrySet(), ", ", "{", "}", 0, null, (Function1)new AbstractMap$toString.AbstractMap$toString$1(this), 24, null);
    }
    
    private final String toString(final Entry<? extends K, ? extends V> entry) {
        return this.toString(entry.getKey()) + "=" + this.toString(entry.getValue());
    }
    
    private final String toString(final Object o) {
        return (o == this) ? "(this Map)" : String.valueOf(o);
    }
    
    @NotNull
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = (Collection<? extends V>)new AbstractMap$values.AbstractMap$values$1(this);
        }
        final Collection<? extends V> values = this._values;
        if (values == null) {
            Intrinsics.throwNpe();
        }
        return (Collection<V>)values;
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.getValues();
    }
    
    private final Entry<K, V> implFindEntry(final K key) {
        final Iterable $this$firstOrNull$iv = this.entrySet();
        final int $i$f$firstOrNull = 0;
        for (final Object element$iv : $this$firstOrNull$iv) {
            final Entry it = (Entry)element$iv;
            final int n = 0;
            if (Intrinsics.areEqual(it.getKey(), key)) {
                final Object o = element$iv;
                return (Entry<K, V>)o;
            }
        }
        final Object o = null;
        return (Entry<K, V>)o;
    }
    
    protected AbstractMap() {
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)this.getEntries();
    }
    
    public abstract Set getEntries();
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public V put(final K k, final V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public V remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib" })
    public static final class Companion
    {
        public final int entryHashCode$kotlin_stdlib(@NotNull final Entry<?, ?> e) {
            Intrinsics.checkParameterIsNotNull(e, "e");
            final Entry $this$with = e;
            final int n = 0;
            final Object key = $this$with.getKey();
            final int n2 = (key != null) ? key.hashCode() : 0;
            final Object value = $this$with.getValue();
            return n2 ^ ((value != null) ? value.hashCode() : 0);
        }
        
        @NotNull
        public final String entryToString$kotlin_stdlib(@NotNull final Entry<?, ?> e) {
            Intrinsics.checkParameterIsNotNull(e, "e");
            final Entry $this$with = e;
            final int n = 0;
            return new StringBuilder().append($this$with.getKey()).append('=').append($this$with.getValue()).toString();
        }
        
        public final boolean entryEquals$kotlin_stdlib(@NotNull final Entry<?, ?> e, @Nullable final Object other) {
            Intrinsics.checkParameterIsNotNull(e, "e");
            return other instanceof Entry && Intrinsics.areEqual(e.getKey(), ((Entry)other).getKey()) && Intrinsics.areEqual(e.getValue(), ((Entry)other).getValue());
        }
        
        private Companion() {
        }
    }
}
