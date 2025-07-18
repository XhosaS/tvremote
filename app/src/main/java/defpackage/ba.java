package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ba extends eo {
    public ba(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private final void j(Map map, View view) {
        int[] iArr = ahj.a;
        String strF = ahc.f(view);
        if (strF != null) {
            map.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    j(map, childAt);
                }
            }
        }
    }

    private final void k(we weVar, final Collection collection) {
        Set setEntrySet = weVar.entrySet();
        agux aguxVar = new agux() { // from class: af
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                View view = (View) entry.getValue();
                int[] iArr = ahj.a;
                return Boolean.valueOf(agqq.D(collection, ahc.f(view)));
            }
        };
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!((Boolean) aguxVar.a(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0447 A[LOOP:19: B:156:0x0441->B:158:0x0447, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Type inference failed for: r29v0, types: [ba, eo] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.eo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r30, boolean r31) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba.a(java.util.List, boolean):void");
    }
}
