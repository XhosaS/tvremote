package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyy {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eyy(etn etnVar, boolean z, List list, Exception exc) {
        this.d = etnVar;
        this.a = z;
        this.b = list;
        this.c = exc;
    }

    public final boolean a() {
        return (((bxx) this.c).d() && ((bxx) this.d).d() && ((bxx) this.b).d()) ? false : true;
    }

    public final boolean b(bys bysVar) {
        return bysVar.h != null && (((bxx) this.c).c(bysVar) || ((bxx) this.b).c(bysVar));
    }

    public final void c(bys bysVar) {
        ((bxx) this.c).e(bysVar);
        ((bxx) this.b).e(bysVar);
        ((bxx) this.d).e(bysVar);
    }

    public final void d(bys bysVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ((bxx) this.c).b(bysVar);
            ((bxx) this.d).b(bysVar);
            return;
        }
        if (i2 == 1) {
            ((bxx) this.b).b(bysVar);
            ((bxx) this.d).b(bysVar);
        } else {
            if (i2 != 2) {
                if (bysVar.h != null) {
                    ((bxx) this.d).b(bysVar);
                    return;
                } else {
                    ((bxx) this.b).b(bysVar);
                    return;
                }
            }
            if (bysVar.h != null) {
                ((bxx) this.d).b(bysVar);
            } else {
                ((bxx) this.c).b(bysVar);
            }
        }
    }

    public eyy() {
        this.c = new bxx();
        this.b = new bxx();
        this.d = new bxx();
        this.a = !r0.d();
    }

    public eyy(Context context, ezd ezdVar) {
        AudioManager audioManagerI = context == null ? null : dvb.i(context);
        if (audioManagerI != null) {
            context.getClass();
            if (!edt.an(context)) {
                Spatializer spatializer = audioManagerI.getSpatializer();
                this.b = spatializer;
                this.a = cyp$$ExternalSyntheticApiModelOutline6.m((Object) spatializer).getImmersiveAudioLevel() != 0;
                eyx eyxVar = new eyx(ezdVar);
                this.d = eyxVar;
                Looper looperMyLooper = Looper.myLooper();
                eci.e(looperMyLooper);
                Handler handler = new Handler(looperMyLooper);
                this.c = handler;
                cyp$$ExternalSyntheticApiModelOutline6.m((Object) spatializer).addOnSpatializerStateChangedListener(new emk(handler, 2), eyxVar);
                return;
            }
        }
        this.b = null;
        this.a = false;
        this.c = null;
        this.d = null;
    }
}
