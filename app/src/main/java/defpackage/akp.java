package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akp {
    public final View a;
    public final ArrayList b = new ArrayList();
    public acs c;
    public acs d;
    public int e;

    public akp(ViewGroup viewGroup) {
        acs acsVar = acs.a;
        this.c = acsVar;
        this.d = acsVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        akn aknVar = new akn(this, viewGroup.getContext(), viewGroup);
        this.a = aknVar;
        aknVar.setWillNotDraw(true);
        agk agkVar = new agk() { // from class: akl
            @Override // defpackage.agk
            public final ajc a(View view, ajc ajcVar) {
                aiy aiyVar = ajcVar.b;
                akp akpVar = this.a;
                acs acsVarA = akpVar.a(ajcVar);
                acs acsVarC = acs.c(aiyVar.c(519), aiyVar.c(64));
                if (!acsVarA.equals(akpVar.c) || !acsVarC.equals(akpVar.d)) {
                    akpVar.c = acsVarA;
                    akpVar.d = acsVarC;
                    ArrayList arrayList = akpVar.b;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((akk) arrayList.get(size)).a();
                    }
                }
                return ajcVar;
            }
        };
        int[] iArr = ahj.a;
        ahc.k(aknVar, agkVar);
        aik.a(aknVar, new ako(this));
        viewGroup.addView(aknVar, 0);
    }

    public final acs a(ajc ajcVar) {
        aiy aiyVar = ajcVar.b;
        return acs.c(aiyVar.a(519), aiyVar.a(64));
    }
}
