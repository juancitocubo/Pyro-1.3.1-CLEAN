// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.experimental;

import kotlin.SinceKotlin;
import kotlin.Experimental;
import kotlin.Metadata;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.annotation.MustBeDocumented;
import java.lang.annotation.Annotation;

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = { AnnotationTarget.ANNOTATION_CLASS })
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({ ElementType.ANNOTATION_TYPE })
@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002" }, d2 = { "Lkotlin/experimental/ExperimentalTypeInference;", "", "kotlin-stdlib" })
@Experimental(level = Experimental.Level.ERROR)
@SinceKotlin(version = "1.3")
public @interface ExperimentalTypeInference {
}
