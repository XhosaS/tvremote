package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rfp {
    public Context a;
    public yrp b;
    public yrp c;
    public yrp d;
    public yrp e;
    private yrp f;

    public final rfr a() {
        this.a.getClass();
        if (this.b == null) {
            this.b = rfr.b;
        }
        if (this.c == null) {
            this.c = rfr.d(this.a);
        }
        if (this.d == null) {
            this.d = new yrp() { // from class: rfm
                @Override // defpackage.yrp
                public final Object eV() {
                    return yqt.i(new rma(this.a.b));
                }
            };
        }
        if (this.e == null) {
            Context context = this.a;
            Context context2 = rfr.a;
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new uej(new uei(context)), new ufc());
            this.e = yru.a(new yrp() { // from class: rfj
                @Override // defpackage.yrp
                public final Object eV() {
                    Context context3 = rfr.a;
                    return new ueg(arrayList);
                }
            });
        }
        if (this.f == null) {
            this.f = new yrp() { // from class: rfn
                @Override // defpackage.yrp
                public final Object eV() {
                    Context context3 = this.a.a;
                    Context context4 = rfr.a;
                    try {
                        return yqt.i(context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                        return ypv.a;
                    }
                }
            };
        }
        return new rfr(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
