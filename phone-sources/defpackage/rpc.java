package defpackage;

import android.app.ActivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rpc implements tsv {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ rpc(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        if (this.b == 0) {
            return ((ActivityManager.RunningAppProcessInfo) obj).pid == this.a;
        }
        int iAK = a.aK(((vzi) obj).c);
        if (iAK == 0) {
            iAK = 1;
        }
        return this.a == iAK;
    }
}
