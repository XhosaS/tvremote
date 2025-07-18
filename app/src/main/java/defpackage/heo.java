package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class heo extends pq {
    public List d;
    protected final hek e;
    protected final ColorStateList f;
    protected final int g;

    public heo(Context context, hek hekVar) {
        this.e = hekVar;
        this.g = (int) context.getResources().getDimension(R.dimen.pressed_foreground_ripple_radius);
        this.f = ColorStateList.valueOf(context.getColor(R.color.pressed_foreground_ripple_color));
    }

    @Override // defpackage.pq
    public final int a() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.pq
    public qv d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.entity_detail_action, viewGroup, false);
        viewInflate.setForeground(new jrq(this.f, this.g));
        return new hen(viewInflate, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    @Override // defpackage.pq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.qv r13, int r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heo.f(qv, int):void");
    }

    @Override // defpackage.pq
    public final void j(qv qvVar) {
        if (qvVar instanceof hen) {
            hen henVar = (hen) qvVar;
            wke wkeVar = henVar.x;
            wkeVar.a().j(henVar.s);
        }
    }
}
