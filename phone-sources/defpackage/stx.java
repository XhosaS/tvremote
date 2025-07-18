package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.googletv.app.internal.MaterialChipActivity;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stx {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public boolean c;
    public boolean d;
    public zft e;

    public final int a() {
        if (!this.c) {
            return -1;
        }
        Set set = this.b;
        if (set.isEmpty()) {
            return -1;
        }
        return ((Integer) set.iterator().next()).intValue();
    }

    public final Set b() {
        return new HashSet(this.b);
    }

    public final void c(int i) {
        sui suiVar = (sui) this.a.get(Integer.valueOf(i));
        if (suiVar != null && e(suiVar)) {
            d();
        }
    }

    public final void d() {
        zft zftVar = this.e;
        if (zftVar != null) {
            b();
            Object obj = zftVar.a;
            ChipGroup chipGroup = (ChipGroup) obj;
            tko tkoVar = chipGroup.b;
            if (tkoVar != null) {
                chipGroup.a.g((ViewGroup) obj);
                ChipGroup chipGroup2 = (ChipGroup) tkoVar.b;
                if (chipGroup2.a.c) {
                    Object obj2 = tkoVar.a;
                    MaterialChipActivity.m100$r8$lambda$gYoT6nknftyobuncnwKSN00N_k((MaterialChipActivity) ((pku) obj2).a, chipGroup, chipGroup2.a());
                }
            }
        }
    }

    public final boolean e(sui suiVar) {
        Integer numValueOf = Integer.valueOf(suiVar.getId());
        Set set = this.b;
        if (set.contains(numValueOf)) {
            return false;
        }
        sui suiVar2 = (sui) this.a.get(Integer.valueOf(a()));
        if (suiVar2 != null) {
            f(suiVar2, false);
        }
        boolean zAdd = set.add(numValueOf);
        if (!suiVar.isChecked()) {
            suiVar.setChecked(true);
        }
        return zAdd;
    }

    public final boolean f(sui suiVar, boolean z) {
        Integer numValueOf = Integer.valueOf(suiVar.getId());
        Set set = this.b;
        if (!set.contains(numValueOf)) {
            return false;
        }
        if (z && set.size() == 1 && set.contains(numValueOf)) {
            suiVar.setChecked(true);
            return false;
        }
        boolean zRemove = set.remove(numValueOf);
        if (suiVar.isChecked()) {
            suiVar.setChecked(false);
        }
        return zRemove;
    }

    public final void g(ViewGroup viewGroup) {
        Set setB = b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof sui) && setB.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
    }
}
