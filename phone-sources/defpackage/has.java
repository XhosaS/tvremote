package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class has {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[2];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr2;
    }
}
