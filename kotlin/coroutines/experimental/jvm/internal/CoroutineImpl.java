// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.experimental.jvm.internal;

import kotlin.Unit;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.Metadata;
import kotlin.coroutines.experimental.Continuation;
import kotlin.jvm.internal.Lambda;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H$J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00038\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00058\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b" }, d2 = { "Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;", "Lkotlin/jvm/internal/Lambda;", "", "Lkotlin/coroutines/experimental/Continuation;", "arity", "", "completion", "(ILkotlin/coroutines/experimental/Continuation;)V", "_context", "Lkotlin/coroutines/experimental/CoroutineContext;", "_facade", "context", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "facade", "getFacade", "()Lkotlin/coroutines/experimental/Continuation;", "label", "create", "", "value", "doResume", "data", "exception", "", "resume", "resumeWithException", "kotlin-stdlib-coroutines" })
public abstract class CoroutineImpl extends Lambda<Object> implements Continuation<Object>
{
    @JvmField
    protected int label;
    private final CoroutineContext _context;
    private Continuation<Object> _facade;
    @JvmField
    @Nullable
    protected Continuation<Object> completion;
    
    @NotNull
    @Override
    public CoroutineContext getContext() {
        final CoroutineContext context = this._context;
        if (context == null) {
            Intrinsics.throwNpe();
        }
        return context;
    }
    
    @NotNull
    public final Continuation<Object> getFacade() {
        if (this._facade == null) {
            final CoroutineContext context = this._context;
            if (context == null) {
                Intrinsics.throwNpe();
            }
            this._facade = CoroutineIntrinsics.interceptContinuationIfNeeded(context, this);
        }
        final Continuation<Object> facade = this._facade;
        if (facade == null) {
            Intrinsics.throwNpe();
        }
        return facade;
    }
    
    @Override
    public void resume(@Nullable final Object value) {
        final Continuation<Object> completion = this.completion;
        if (completion == null) {
            Intrinsics.throwNpe();
        }
        final Continuation<Object> continuation = completion;
        try {
            final int n = 0;
            final Object doResume = this.doResume(value, null);
            if (doResume != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                final Continuation continuation2 = continuation;
                if (continuation2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                continuation2.resume(doResume);
            }
        }
        catch (Throwable t) {
            continuation.resumeWithException(t);
        }
    }
    
    @Override
    public void resumeWithException(@NotNull final Throwable exception) {
        Intrinsics.checkParameterIsNotNull(exception, "exception");
        final Continuation<Object> completion = this.completion;
        if (completion == null) {
            Intrinsics.throwNpe();
        }
        final Continuation<Object> continuation = completion;
        try {
            final int n = 0;
            final Object doResume = this.doResume(null, exception);
            if (doResume != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                final Continuation continuation2 = continuation;
                if (continuation2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                continuation2.resume(doResume);
            }
        }
        catch (Throwable t) {
            continuation.resumeWithException(t);
        }
    }
    
    @Nullable
    protected abstract Object doResume(@Nullable final Object p0, @Nullable final Throwable p1);
    
    @NotNull
    public Continuation<Unit> create(@NotNull final Continuation<?> completion) {
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        throw new IllegalStateException("create(Continuation) has not been overridden");
    }
    
    @NotNull
    public Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> completion) {
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        throw new IllegalStateException("create(Any?;Continuation) has not been overridden");
    }
    
    public CoroutineImpl(final int arity, @Nullable final Continuation<Object> completion) {
        super(arity);
        this.completion = completion;
        this.label = ((this.completion != null) ? 0 : -1);
        final Continuation<Object> completion2 = this.completion;
        this._context = ((completion2 != null) ? completion2.getContext() : null);
    }
}
