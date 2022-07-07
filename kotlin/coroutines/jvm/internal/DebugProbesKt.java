// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.coroutines.Continuation;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b" }, d2 = { "probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlin-stdlib" })
public final class DebugProbesKt
{
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        return (Continuation<T>)completion;
    }
    
    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineResumed(@NotNull final Continuation<?> frame) {
        Intrinsics.checkParameterIsNotNull(frame, "frame");
    }
    
    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineSuspended(@NotNull final Continuation<?> frame) {
        Intrinsics.checkParameterIsNotNull(frame, "frame");
    }
}
