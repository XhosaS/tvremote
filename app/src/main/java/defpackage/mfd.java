package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public @interface mfd {
    int a() default 1;

    int b() default 1000;

    int c() default 1;

    int d() default 1;

    int e() default 1000;

    long f() default 1;

    TimeUnit g() default TimeUnit.MINUTES;
}
