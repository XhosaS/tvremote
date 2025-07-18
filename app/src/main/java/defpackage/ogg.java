package defpackage;

import com.google.android.libraries.elements.interfaces.ComponentConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ogg extends ogi {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;

    public ogg() {
    }

    @Override // defpackage.ogi
    public final ComponentConfig a() {
        if (this.l == 262143) {
            return new ComponentConfig(this.a, this.m, this.n, this.b, this.o, this.p, this.c, this.d, this.q, this.r, this.e, this.s, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.l & 1) == 0) {
            sb.append(" reuseSubscriptionProcessors");
        }
        if ((this.l & 2) == 0) {
            sb.append(" useSubscriptionProcessorMap");
        }
        if ((this.l & 4) == 0) {
            sb.append(" usePriorModelHash");
        }
        if ((this.l & 8) == 0) {
            sb.append(" suppressPriorModelCheck");
        }
        if ((this.l & 16) == 0) {
            sb.append(" useElementProtoPtr");
        }
        if ((this.l & 32) == 0) {
            sb.append(" elementHashMode");
        }
        if ((this.l & 64) == 0) {
            sb.append(" disableAsyncComponentUpdateCallbacks");
        }
        if ((this.l & 128) == 0) {
            sb.append(" disableFbConversion");
        }
        if ((this.l & 256) == 0) {
            sb.append(" ekoStoreParsedCallTransforms");
        }
        if ((this.l & 512) == 0) {
            sb.append(" ekoCallTransformEviction");
        }
        if ((this.l & 1024) == 0) {
            sb.append(" enableEkoNoSerialization");
        }
        if ((this.l & 2048) == 0) {
            sb.append(" enableEkoVersion");
        }
        if ((this.l & 4096) == 0) {
            sb.append(" enableRenderNextPerformanceLogging");
        }
        if ((this.l & 8192) == 0) {
            sb.append(" enableKnownFieldsModelParsing");
        }
        if ((this.l & 16384) == 0) {
            sb.append(" componentClearStateOnSet");
        }
        if ((this.l & 32768) == 0) {
            sb.append(" disableSharedElementArenaAllocation");
        }
        if ((this.l & 65536) == 0) {
            sb.append(" enableNativeTemplateResolution");
        }
        if ((this.l & 131072) == 0) {
            sb.append(" enableWasmNoSerialization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ogi
    public final void b(boolean z) {
        this.r = z;
        this.l |= 512;
    }

    @Override // defpackage.ogi
    public final void c(boolean z) {
        this.q = z;
        this.l |= 256;
    }

    @Override // defpackage.ogi
    public final void d(int i) {
        this.p = i;
        this.l |= 32;
    }

    @Override // defpackage.ogi
    public final void e(int i) {
        this.s = i;
        this.l |= 2048;
    }

    @Override // defpackage.ogi
    public final void f(boolean z) {
        this.o = z;
        this.l |= 16;
    }

    @Override // defpackage.ogi
    public final void g(boolean z) {
        this.n = z;
        this.l |= 4;
    }

    @Override // defpackage.ogi
    public final void h(boolean z) {
        this.m = z;
        this.l |= 2;
    }

    public ogg(ComponentConfig componentConfig) {
        this.a = componentConfig.getReuseSubscriptionProcessors();
        this.m = componentConfig.getUseSubscriptionProcessorMap();
        this.n = componentConfig.getUsePriorModelHash();
        this.b = componentConfig.getSuppressPriorModelCheck();
        this.o = componentConfig.getUseElementProtoPtr();
        this.p = componentConfig.getElementHashMode();
        this.c = componentConfig.getDisableAsyncComponentUpdateCallbacks();
        this.d = componentConfig.getDisableFbConversion();
        this.q = componentConfig.getEkoStoreParsedCallTransforms();
        this.r = componentConfig.getEkoCallTransformEviction();
        this.e = componentConfig.getEnableEkoNoSerialization();
        this.s = componentConfig.getEnableEkoVersion();
        this.f = componentConfig.getEnableRenderNextPerformanceLogging();
        this.g = componentConfig.getEnableKnownFieldsModelParsing();
        this.h = componentConfig.getComponentClearStateOnSet();
        this.i = componentConfig.getDisableSharedElementArenaAllocation();
        this.j = componentConfig.getEnableNativeTemplateResolution();
        this.k = componentConfig.getEnableWasmNoSerialization();
        this.l = 262143;
    }
}
