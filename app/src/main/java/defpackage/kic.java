package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kic {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    protected kic(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }
}
