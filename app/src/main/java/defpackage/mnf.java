package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.DirectUpdateProcessor;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnf implements obe {
    public DirectUpdateProcessor a;
    public DirectUpdatePropertiesOuterClass$DirectUpdateProperties b;
    public final Map c;
    private final DisplayMetrics j;
    private final ByteStore k;
    private final DirectUpdateDataRelay l;
    private Handler m;
    private mnc n;
    public float d = 1.0f;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    private boolean o = false;

    public mnf(DisplayMetrics displayMetrics, ByteStore byteStore, DirectUpdateDataRelay directUpdateDataRelay, DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties, Map map) {
        this.j = displayMetrics;
        this.k = byteStore;
        this.l = directUpdateDataRelay;
        this.b = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        this.c = map;
    }

    private final void h(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        if (this.m == null) {
            this.m = new Handler(Looper.getMainLooper());
        }
        this.m.post(runnable);
    }

    private final void i(final dtl dtlVar, final Object obj) {
        if (dtlVar == null) {
            return;
        }
        h(new Runnable() { // from class: mne
            @Override // java.lang.Runnable
            public final void run() {
                dtlVar.a(obj);
            }
        });
    }

    @Override // defpackage.obe
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.obe
    public final void b() {
        DirectUpdateProcessor directUpdateProcessor = this.a;
        if (directUpdateProcessor != null) {
            directUpdateProcessor.dispose();
            this.a = null;
        }
        this.n = null;
        this.o = true;
    }

    @Override // defpackage.obe
    public final void c() {
        h(new Runnable() { // from class: mnd
            @Override // java.lang.Runnable
            public final void run() {
                DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties;
                mnf mnfVar = this.a;
                DirectUpdateProcessor directUpdateProcessor = mnfVar.a;
                if (directUpdateProcessor == null || (directUpdatePropertiesOuterClass$DirectUpdateProperties = mnfVar.b) == null) {
                    return;
                }
                directUpdateProcessor.processProperties(directUpdatePropertiesOuterClass$DirectUpdateProperties);
            }
        });
    }

    @Override // defpackage.obe
    public final void d(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties) {
        if (directUpdatePropertiesOuterClass$DirectUpdateProperties == null) {
            return;
        }
        this.b = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        c();
    }

    @Override // defpackage.obe
    public final void e(Map map) {
        acvm acvmVar = acvm.DYNAMIC_PROP_TYPE_ALPHA;
        Float f = (Float) map.get(acvmVar);
        if (f != null) {
            this.d = f.floatValue();
            i((dtl) this.c.get(acvmVar), f);
        }
        acvm acvmVar2 = acvm.DYNAMIC_PROP_TYPE_SCALE_X;
        Float f2 = (Float) map.get(acvmVar2);
        if (f2 != null) {
            this.e = f2.floatValue();
            i((dtl) this.c.get(acvmVar2), f2);
        }
        acvm acvmVar3 = acvm.DYNAMIC_PROP_TYPE_SCALE_Y;
        Float f3 = (Float) map.get(acvmVar3);
        if (f3 != null) {
            this.f = f3.floatValue();
            i((dtl) this.c.get(acvmVar3), f3);
        }
        acvm acvmVar4 = acvm.DYNAMIC_PROP_TYPE_ROTATION;
        Float f4 = (Float) map.get(acvmVar4);
        if (f4 != null) {
            this.g = f4.floatValue();
            i((dtl) this.c.get(acvmVar4), f4);
        }
        acvm acvmVar5 = acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X;
        Float f5 = (Float) map.get(acvmVar5);
        if (f5 != null) {
            this.h = f5.floatValue();
            i((dtl) this.c.get(acvmVar5), f5);
        }
        acvm acvmVar6 = acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y;
        Float f6 = (Float) map.get(acvmVar6);
        if (f6 != null) {
            this.i = f6.floatValue();
            i((dtl) this.c.get(acvmVar6), f6);
        }
    }

    @Override // defpackage.obe
    public final void f() {
        acvm acvmVar = acvm.DYNAMIC_PROP_TYPE_ALPHA;
        dtl dtlVar = new dtl(Float.valueOf(this.d));
        Map map = this.c;
        map.put(acvmVar, dtlVar);
        map.put(acvm.DYNAMIC_PROP_TYPE_SCALE_X, new dtl(Float.valueOf(this.e)));
        map.put(acvm.DYNAMIC_PROP_TYPE_SCALE_Y, new dtl(Float.valueOf(this.f)));
        map.put(acvm.DYNAMIC_PROP_TYPE_ROTATION, new dtl(Float.valueOf(this.g)));
        map.put(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X, new dtl(Float.valueOf(this.h)));
        map.put(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y, new dtl(Float.valueOf(this.i)));
        mnc mncVar = new mnc(map, this.j);
        this.n = mncVar;
        DirectUpdateProcessor directUpdateProcessorCreate = DirectUpdateProcessor.create(mncVar, this.k, this.l, null);
        this.a = directUpdateProcessorCreate;
        if (directUpdateProcessorCreate == null) {
            throw new ocp("Error creating DirectUpdateProcessor");
        }
        this.o = false;
    }

    @Override // defpackage.obe
    public final boolean g() {
        return this.o;
    }
}
