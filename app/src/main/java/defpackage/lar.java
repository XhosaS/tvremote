package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lar {
    final lbk a;

    public lar(lih lihVar) {
        this.a = lihVar.l;
    }

    final boolean a() {
        try {
            lbk lbkVar = this.a;
            kma kmaVarA = kmb.a.a(lbkVar.a);
            if (kmaVarA != null) {
                return kmaVarA.b("com.android.vending", 128).versionCode >= 80837300;
            }
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            lbk lbkVar2 = this.a;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.k.b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
