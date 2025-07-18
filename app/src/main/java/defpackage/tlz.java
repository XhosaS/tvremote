package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlz extends tmi {
    private final agow b;
    private final String c;
    private final addl d;
    private final String e;
    private final String f;
    private final tmd g;
    private final acjn h;
    private final Object i;
    private acji j;
    private final tmq k;

    public tlz(agow agowVar, tmq tmqVar, String str, addl addlVar, String str2, String str3, tmd tmdVar, acjn acjnVar) {
        super(agowVar);
        this.b = agowVar;
        this.k = tmqVar;
        this.c = str;
        this.d = addlVar;
        this.e = str2;
        this.f = str3;
        this.g = tmdVar;
        this.h = acjnVar;
        this.i = new Object();
    }

    @Override // defpackage.tmi
    public final /* bridge */ /* synthetic */ tmi a(addl addlVar) {
        return new tlz(this.b, this.k, this.c, addlVar, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.tmi
    public final /* bridge */ /* synthetic */ tmi b(acji acjiVar) {
        return new tmc(this.b, this.k, acjiVar);
    }

    @Override // defpackage.tmi
    public final /* bridge */ /* synthetic */ tmi c(acjn acjnVar) {
        return new tlz(this.b, this.k, this.c, this.d, this.e, this.f, this.g, acjnVar);
    }

    @Override // defpackage.tmi
    public final /* bridge */ /* synthetic */ tmi d(tmd tmdVar) {
        return new tlz(this.b, this.k, this.c, this.d, this.e, this.f, tmdVar, this.h);
    }

    @Override // defpackage.tmi
    protected final acji e() {
        acji acjiVar;
        tmd tmdVar = this.g;
        int i = tmdVar.b;
        Object obj = this.i;
        int i2 = tmdVar.a;
        synchronized (obj) {
            if (this.j == null) {
                acji acjiVar2 = acji.a;
                acjh acjhVar = new acjh();
                addl addlVar = this.d;
                if (addlVar != null) {
                    if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acjhVar.y();
                    }
                    acji acjiVar3 = (acji) acjhVar.b;
                    acjiVar3.c = addlVar.X;
                    acjiVar3.b |= 1;
                }
                String str = this.c;
                if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acjhVar.y();
                }
                acji acjiVar4 = (acji) acjhVar.b;
                acjiVar4.b |= 2;
                acjiVar4.d = str;
                if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acjhVar.y();
                }
                acji acjiVar5 = (acji) acjhVar.b;
                acjiVar5.b |= 8;
                acjiVar5.f = i2;
                if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acjhVar.y();
                }
                acji acjiVar6 = (acji) acjhVar.b;
                acjiVar6.b |= 4;
                acjiVar6.e = 0L;
                String str2 = this.e;
                if (str2 != null) {
                    if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acjhVar.y();
                    }
                    acji acjiVar7 = (acji) acjhVar.b;
                    acjiVar7.b |= 16;
                    acjiVar7.g = str2;
                }
                String str3 = this.f;
                if (str3 != null) {
                    if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acjhVar.y();
                    }
                    acji acjiVar8 = (acji) acjhVar.b;
                    acjiVar8.b |= 32;
                    acjiVar8.h = str3;
                }
                acjn acjnVar = this.h;
                if (acjnVar != null) {
                    abxc abxcVar = acjp.a;
                    abxcVar.getClass();
                    acjhVar.f(abxcVar, acjnVar);
                }
                this.j = acjj.a(acjhVar);
            }
            acjiVar = this.j;
            if (acjiVar == null) {
                agvy.b("dimensions");
                acjiVar = null;
            }
        }
        return acjiVar;
    }
}
