// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.SinceKotlin;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.KFunction;
import kotlin.reflect.KCallable;
import java.util.Collection;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010B\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020GH\u0016J\u0012\u0010H\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010J\u001a\u00020-H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R(\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0014\u001a\u0004\b2\u0010\u000bR\u0016\u00103\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010/R \u00105\u001a\b\u0012\u0004\u0012\u0002060\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0014\u001a\u0004\b8\u0010\u000bR \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR\u001c\u0010=\u001a\u0004\u0018\u00010>8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010A¨\u0006K" }, d2 = { "Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "sealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "supertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "typeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "visibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "kotlin-stdlib" })
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer
{
    @NotNull
    private final Class<?> jClass;
    
    @Nullable
    @Override
    public String getSimpleName() {
        this.error();
        throw null;
    }
    
    @Nullable
    @Override
    public String getQualifiedName() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public Collection<KCallable<?>> getMembers() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public Collection<KFunction<Object>> getConstructors() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public Collection<KClass<?>> getNestedClasses() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public List<Annotation> getAnnotations() {
        this.error();
        throw null;
    }
    
    @Nullable
    @Override
    public Object getObjectInstance() {
        this.error();
        throw null;
    }
    
    @SinceKotlin(version = "1.1")
    @Override
    public boolean isInstance(@Nullable final Object value) {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public List<KTypeParameter> getTypeParameters() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public List<KType> getSupertypes() {
        this.error();
        throw null;
    }
    
    @NotNull
    @Override
    public List<KClass<?>> getSealedSubclasses() {
        this.error();
        throw null;
    }
    
    @Nullable
    @Override
    public KVisibility getVisibility() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isFinal() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isOpen() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isAbstract() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isSealed() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isData() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isInner() {
        this.error();
        throw null;
    }
    
    @Override
    public boolean isCompanion() {
        this.error();
        throw null;
    }
    
    private final Void error() {
        throw new KotlinReflectionNotSupportedError();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof ClassReference && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType((KClass<Object>)this), JvmClassMappingKt.getJavaObjectType((KClass<Object>)other));
    }
    
    @Override
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType((KClass<Object>)this).hashCode();
    }
    
    @NotNull
    @Override
    public String toString() {
        return this.getJClass().toString() + " (Kotlin reflection is not available)";
    }
    
    @NotNull
    @Override
    public Class<?> getJClass() {
        return this.jClass;
    }
    
    public ClassReference(@NotNull final Class<?> jClass) {
        Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        this.jClass = jClass;
    }
}
