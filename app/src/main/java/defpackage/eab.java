package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class eab implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        int iWidth;
        if (obj instanceof View) {
            iWidth = ((View) obj).getWidth();
        } else {
            if (!(obj instanceof Drawable)) {
                throw new UnsupportedOperationException("Getting width from unsupported mount content: ".concat(obj.toString()));
            }
            iWidth = ((Drawable) obj).getBounds().width();
        }
        return iWidth;
    }

    @Override // defpackage.eaf
    public final String b() {
        return "width";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if (!(obj instanceof elr)) {
            if (obj instanceof View) {
                View view = (View) obj;
                int left = view.getLeft();
                enc.a(left, view.getTop(), (int) (left + f), view.getBottom(), view, false);
                return;
            }
            if (!(obj instanceof Drawable)) {
                throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
            }
            Drawable drawable = (Drawable) obj;
            ena.b(drawable, (int) f, drawable.getBounds().height());
            return;
        }
        elr elrVar = (elr) obj;
        if (elrVar instanceof emx) {
            ((emx) elrVar).setAnimatedWidth((int) f);
        } else {
            int left2 = elrVar.getLeft();
            enc.a(left2, elrVar.getTop(), (int) (left2 + f), elrVar.getBottom(), elrVar, false);
        }
        List listD = eae.d(elrVar);
        if (listD != null) {
            int i = (int) f;
            int height = elrVar.getHeight();
            for (int i2 = 0; i2 < listD.size(); i2++) {
                ena.b((Drawable) listD.get(i2), i, height);
            }
        }
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        return dviVar.b.width();
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
    }
}
