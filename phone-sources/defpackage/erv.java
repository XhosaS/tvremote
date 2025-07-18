package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erv extends eho implements erw {
    private final Context a;
    private final int b;

    public erv(Context context, int i) {
        super(new ehk[1], new erz[1]);
        this.a = context;
        this.b = i;
    }

    @Override // defpackage.ehh
    public final String c() {
        throw null;
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehi h(Throwable th) {
        return new erx("Unexpected decode error", th);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehi i(ehk ehkVar, ehm ehmVar, boolean z) throws NumberFormatException {
        erz erzVar = (erz) ehmVar;
        ByteBuffer byteBuffer = ehkVar.c;
        byteBuffer.getClass();
        a.ab(byteBuffer.hasArray());
        a.H(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.b;
            if (i == -1) {
                Context context = this.a;
                if (context != null) {
                    Point pointG = edt.G(context);
                    int i2 = pointG.x;
                    int i3 = pointG.y;
                    dze dzeVar = ehkVar.a;
                    if (dzeVar != null) {
                        int i4 = dzeVar.ax;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = dzeVar.ay;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    int iMax = Math.max(i2, i3);
                    i = (iMax + iMax) - 1;
                } else {
                    i = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
            }
            erzVar.a = ecm.f(byteBuffer.array(), byteBuffer.remaining(), i);
            erzVar.timeUs = ehkVar.e;
            return null;
        } catch (eaf e) {
            return new erx("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new erx(e2);
        }
    }

    @Override // defpackage.eho
    protected final ehk j() {
        return new ehk(1);
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehm l() {
        return new erz(this);
    }

    @Override // defpackage.erw
    public final /* bridge */ /* synthetic */ erz s() {
        return (erz) super.b();
    }
}
