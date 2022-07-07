// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.intrinsics;

import org.jetbrains.annotations.NotNull;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u001c\b\u0004\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087H\u00f8\u0001\u0000¢\u0006\u0002\u0010\u000b\"\u001a\u0010\u0000\u001a\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "COROUTINE_SUSPENDED", "", "COROUTINE_SUSPENDED$annotations", "()V", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", "suspendCoroutineUninterceptedOrReturn", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib" }, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsKt extends IntrinsicsKt__IntrinsicsJvmKt
{
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object suspendCoroutineUninterceptedOrReturn(final Function1<? super Continuation<? super T>, ?> block, final Continuation<? super T> continuation) {
        final int $i$f$suspendCoroutineUninterceptedOrReturn = 0;
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
    
    @NotNull
    public static final Object getCOROUTINE_SUSPENDED() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
    
    public IntrinsicsKt__IntrinsicsKt() {
    }
}
