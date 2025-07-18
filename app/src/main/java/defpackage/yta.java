package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
class yta {
    public static final yta a;
    public static final yta b;
    public static final yta c;
    public static final yta d;
    public static final yta e;
    public static final yta f;
    public static final yta g;
    public static final yta h;
    static final yta[] i;
    private static final /* synthetic */ yta[] j;

    static {
        yta ytaVar = new yta("STRONG", 0);
        a = ytaVar;
        yta ytaVar2 = new yta() { // from class: ysu
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                c(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        b = ytaVar2;
        yta ytaVar3 = new yta() { // from class: ysv
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                d(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        c = ytaVar3;
        yta ytaVar4 = new yta() { // from class: ysw
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                c(yuhVar, yuhVarA);
                d(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        d = ytaVar4;
        yta ytaVar5 = new yta("WEAK", 4);
        e = ytaVar5;
        yta ytaVar6 = new yta() { // from class: ysx
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                c(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        f = ytaVar6;
        yta ytaVar7 = new yta() { // from class: ysy
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                d(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        g = ytaVar7;
        yta ytaVar8 = new yta() { // from class: ysz
            @Override // defpackage.yta
            public final yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
                yuh yuhVarA = super.a(ytmVar, yuhVar, yuhVar2, obj);
                c(yuhVar, yuhVarA);
                d(yuhVar, yuhVarA);
                return yuhVarA;
            }
        };
        h = ytaVar8;
        j = new yta[]{ytaVar, ytaVar2, ytaVar3, ytaVar4, ytaVar5, ytaVar6, ytaVar7, ytaVar8};
        i = new yta[]{ytaVar, ytaVar2, ytaVar3, ytaVar4, ytaVar5, ytaVar6, ytaVar7, ytaVar8};
    }

    public yta(String str, int i2) {
    }

    public static yta[] values() {
        return (yta[]) j.clone();
    }

    public yuh a(ytm ytmVar, yuh yuhVar, yuh yuhVar2, Object obj) {
        return b(ytmVar, obj, yuhVar.a(), yuhVar2);
    }

    final yuh b(ytm ytmVar, Object obj, int i2, yuh yuhVar) {
        switch (ordinal()) {
            case 0:
                return new ytr(obj, i2, yuhVar);
            case 1:
                return new ytp(obj, i2, yuhVar);
            case 2:
                return new ytt(obj, i2, yuhVar);
            case 3:
                return new ytq(obj, i2, yuhVar);
            case 4:
                return new ytz(ytmVar.h, obj, i2, yuhVar);
            case 5:
                return new ytx(ytmVar.h, obj, i2, yuhVar);
            case 6:
                return new yub(ytmVar.h, obj, i2, yuhVar);
            case 7:
                return new yty(ytmVar.h, obj, i2, yuhVar);
            default:
                throw null;
        }
    }

    final void c(yuh yuhVar, yuh yuhVar2) {
        yuhVar2.k(yuhVar.b());
        yug.e(yuhVar.h(), yuhVar2);
        yug.e(yuhVar2, yuhVar.f());
        yug.g(yuhVar);
    }

    final void d(yuh yuhVar, yuh yuhVar2) {
        yuhVar2.q(yuhVar.c());
        yug.f(yuhVar.i(), yuhVar2);
        yug.f(yuhVar2, yuhVar.g());
        yug.h(yuhVar);
    }
}
