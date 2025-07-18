package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqp extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int a;

    @eau(a = eav.NONE)
    @eat(a = 10)
    public drq b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int c;

    public mqp() {
        super("CollectionItemInfoAccessibilityWrapper");
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        drq drqVar = this.b;
        dzs dzsVarAA = dzt.aA(druVar);
        dzsVarAA.S(o(mqp.class, "CollectionItemInfoAccessibilityWrapper", druVar, -1933296085, new Object[]{druVar}));
        dzsVarAA.c(drqVar);
        return dzsVarAA.a();
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        mqp mqpVar = (mqp) super.l();
        drq drqVar = mqpVar.b;
        mqpVar.b = drqVar != null ? drqVar.l() : null;
        return mqpVar;
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        int i = dtuVar.c;
        if (i != -1933296085) {
            if (i != -1048037474) {
                return null;
            }
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        dwy dwyVar = (dwy) obj;
        dui duiVar = dtuVar.b;
        afn afnVar = dwyVar.c;
        View view = dwyVar.a;
        ajr ajrVar = dwyVar.b;
        mqp mqpVar = (mqp) duiVar;
        int i2 = mqpVar.c;
        int i3 = mqpVar.a;
        super/*alk*/.c(view, ajrVar);
        ajrVar.e(ajq.a(i2, i3));
        return null;
    }
}
