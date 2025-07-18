package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aas implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = ahj.a;
        float fB = ahc.b((View) obj);
        float fB2 = ahc.b((View) obj2);
        if (fB > fB2) {
            return -1;
        }
        return fB < fB2 ? 1 : 0;
    }
}
