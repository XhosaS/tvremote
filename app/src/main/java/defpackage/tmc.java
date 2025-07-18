package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tmc extends tmi {
    private final agow b;
    private final acji c;
    private final acji d;
    private final tmq e;

    public tmc(agow agowVar, tmq tmqVar, acji acjiVar) {
        super(agowVar);
        this.b = agowVar;
        this.e = tmqVar;
        this.c = acjiVar;
        this.d = acjiVar;
    }

    @Override // defpackage.tmi
    public final /* synthetic */ tmi a(addl addlVar) {
        acjh acjhVar = new acjh();
        acjhVar.B(this.c);
        if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acjhVar.y();
        }
        tmq tmqVar = this.e;
        agow agowVar = this.b;
        acji acjiVar = (acji) acjhVar.b;
        acjiVar.c = addlVar.X;
        acjiVar.b |= 1;
        return new tmc(agowVar, tmqVar, acjj.a(acjhVar));
    }

    @Override // defpackage.tmi
    public final tmi b(acji acjiVar) {
        return agvy.c(acjiVar, this.c) ? this : new tmc(this.b, this.e, acjiVar);
    }

    @Override // defpackage.tmi
    public final /* synthetic */ tmi c(acjn acjnVar) {
        acjh acjhVar = new acjh();
        acjhVar.B(this.c);
        abxc abxcVar = acjp.a;
        abxcVar.getClass();
        acjhVar.f(abxcVar, acjnVar);
        return new tmc(this.b, this.e, acjj.a(acjhVar));
    }

    @Override // defpackage.tmi
    public final tmi d(tmd tmdVar) {
        acjn acjnVar;
        addl addlVar;
        abxc abxcVar = acjp.a;
        abxcVar.getClass();
        if (abxcVar.a != acji.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        acji acjiVar = this.c;
        if (acjiVar.n.n(abxcVar.d)) {
            abxcVar.getClass();
            acjnVar = (acjn) acay.a(acjiVar, abxcVar);
        } else {
            acjnVar = null;
        }
        agow agowVar = this.b;
        tmq tmqVar = this.e;
        String str = acjiVar.d;
        str.getClass();
        int i = acjiVar.b;
        if ((i & 1) != 0) {
            addl addlVarB = addl.b(acjiVar.c);
            if (addlVarB == null) {
                addlVarB = addl.CLIENT_ID_UNSPECIFIED;
            }
            addlVar = addlVarB;
        } else {
            addlVar = null;
        }
        return new tlz(agowVar, tmqVar, str, addlVar, (i & 16) != 0 ? acjiVar.g : null, (i & 32) != 0 ? acjiVar.h : null, tmdVar, acjnVar);
    }

    @Override // defpackage.tmi
    protected final acji e() {
        return this.d;
    }
}
