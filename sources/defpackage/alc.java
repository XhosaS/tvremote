package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alc implements aho {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ alc(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.aho
    public final void a(Object obj, Object obj2) throws Exception {
        int i = this.c;
        if (i == 0) {
            int i2 = alh.a;
            ane aneVar = new ane((adx) obj2, 1);
            alj aljVar = (alj) ((alk) obj).t();
            Parcel parcelC = aljVar.c();
            int i3 = acl.a;
            parcelC.writeStrongBinder(aneVar);
            parcelC.writeString((String) this.a);
            parcelC.writeString((String) this.b);
            parcelC.writeString(null);
            aljVar.e(11, parcelC);
            return;
        }
        if (i == 1) {
            aee aeeVar = (aee) obj;
            Object obj3 = this.a;
            Object obj4 = this.b;
            try {
                ((aeh) aeeVar.t()).a(new aec((agt) obj4, (aek) obj3), ((aek) obj3).a);
                return;
            } catch (Exception e) {
                try {
                    if (ael.c(((agt) obj4).a.b).b() != null) {
                        aei.b().c(new aej(((aek) obj3).a.a.f, 1003, 1));
                    }
                    throw e;
                } finally {
                    aed.a.set(false);
                }
            }
        }
        if (i != 2) {
            int i4 = alh.a;
            ane aneVar2 = new ane((adx) obj2, 1);
            ((alj) ((alk) obj).t()).a(aneVar2, "CURRENT:" + ((String) this.b) + ":" + ((String) this.a));
            return;
        }
        int i5 = alh.a;
        alj aljVar2 = (alj) ((alk) obj).t();
        ali aliVar = new ali((ahi) this.a, 1);
        Parcel parcelC2 = aljVar2.c();
        parcelC2.writeString((String) this.b);
        int i6 = acl.a;
        parcelC2.writeStrongBinder(aliVar);
        aljVar2.e(28, parcelC2);
    }

    public /* synthetic */ alc(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }

    public /* synthetic */ alc(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }
}
