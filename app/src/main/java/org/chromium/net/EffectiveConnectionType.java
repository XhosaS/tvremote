package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface EffectiveConnectionType {
    public static final int TYPE_2G = 3;
    public static final int TYPE_3G = 4;
    public static final int TYPE_4G = 5;
    public static final int TYPE_LAST = 6;
    public static final int TYPE_OFFLINE = 1;
    public static final int TYPE_SLOW_2G = 2;
    public static final int TYPE_UNKNOWN = 0;
}
