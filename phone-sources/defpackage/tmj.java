package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tmj implements tma {
    public final /* synthetic */ tlq a;
    private final /* synthetic */ int b;

    public tmj(tlz tlzVar, int i) {
        this.b = i;
        this.a = tlzVar;
    }

    @Override // defpackage.tma
    public final void a(tnq tnqVar) {
        if (this.b != 0) {
            if (tnqVar.b == 40) {
                tlq tlqVar = this.a;
                boolean z = ((tnm) tnqVar.c).b;
                Object obj = ((tlz) tlqVar).a.a;
                tug tugVar = (tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "powerServiceListener$lambda$2", 153, "VirtualRemoteImpl.kt");
                Boolean boolValueOf = Boolean.valueOf(z);
                tugVar.v("TV powered on: %s", boolValueOf);
                ((iwu) obj).e.m(boolValueOf);
                return;
            }
            return;
        }
        if (tnqVar.b == 50) {
            tny tnyVar = (tny) tnqVar.c;
            int iBm = a.bm(tnyVar.c);
            if (iBm == 0) {
                iBm = 1;
            }
            int i = iBm - 1;
            char c = i != 1 ? i != 2 ? (char) 1 : (char) 3 : (char) 2;
            tlq tlqVar2 = this.a;
            int i2 = tnyVar.b;
            iwr iwrVar = ((iwu) ((tmk) tlqVar2).a.a).e;
            ymp[] ympVarArr = iwr.a;
            iwrVar.d.c(ympVarArr[7], Boolean.valueOf(c != 1));
            if (c == 3) {
                iwrVar.c.c(ympVarArr[5], new iwe(new ymd(tnyVar.d, tnyVar.e), tnyVar.f, tnyVar.g));
            }
        }
    }

    public /* synthetic */ tmj(tmk tmkVar, int i) {
        this.b = i;
        this.a = tmkVar;
    }

    @Override // defpackage.tma
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.tma
    public final /* synthetic */ void c(int i) {
    }
}
