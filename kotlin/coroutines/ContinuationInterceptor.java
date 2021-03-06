// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010" }, d2 = { "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
public interface ContinuationInterceptor extends Element
{
    public static final Key Key = ContinuationInterceptor.Key.$$INSTANCE;
    
    @NotNull
     <T> Continuation<T> interceptContinuation(@NotNull final Continuation<? super T> p0);
    
    void releaseInterceptedContinuation(@NotNull final Continuation<?> p0);
    
    @Nullable
     <E extends Element> E get(@NotNull final CoroutineContext.Key<E> p0);
    
    @NotNull
    CoroutineContext minusKey(@NotNull final CoroutineContext.Key<?> p0);
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib" })
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor>
    {
        static final /* synthetic */ Key $$INSTANCE;
        
        private Key() {
        }
        
        static {
            $$INSTANCE = new Key();
        }
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3)
    public static final class DefaultImpls
    {
        public static void releaseInterceptedContinuation(final ContinuationInterceptor $this, @NotNull final Continuation<?> continuation) {
            Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        }
        
        @Nullable
        public static <E extends Element> E get(final ContinuationInterceptor $this, @NotNull final CoroutineContext.Key<E> key) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            Element element;
            if (key == ContinuationInterceptor.Key) {
                if ($this == null) {
                    throw new TypeCastException("null cannot be cast to non-null type E");
                }
                element = $this;
            }
            else {
                element = null;
            }
            return (E)element;
        }
        
        @NotNull
        public static CoroutineContext minusKey(final ContinuationInterceptor $this, @NotNull final CoroutineContext.Key<?> key) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            return (CoroutineContext)((key == ContinuationInterceptor.Key) ? ((EmptyCoroutineContext)EmptyCoroutineContext.INSTANCE) : ((ContinuationInterceptor)$this));
        }
        
        public static <R> R fold(final ContinuationInterceptor $this, final R initial, @NotNull final Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkParameterIsNotNull(operation, "operation");
            return Element.DefaultImpls.fold((CoroutineContext.Element)$this, initial, operation);
        }
        
        @NotNull
        public static CoroutineContext plus(final ContinuationInterceptor $this, @NotNull final CoroutineContext context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return Element.DefaultImpls.plus((CoroutineContext.Element)$this, context);
        }
    }
}
