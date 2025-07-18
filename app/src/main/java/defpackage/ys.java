package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ys extends yn {
    public yn[] as = new yn[4];
    public int at = 0;

    public final void M(ArrayList arrayList, int i, zm zmVar) {
        for (int i2 = 0; i2 < this.at; i2++) {
            zmVar.d(this.as[i2]);
        }
        for (int i3 = 0; i3 < this.at; i3++) {
            zf.a(this.as[i3], i, arrayList, zmVar);
        }
    }
}
