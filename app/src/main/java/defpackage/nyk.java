package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Pair;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nyk extends dpb {
    private final dxt c;
    private final njs d;
    private final boolean e;
    private final odj f;
    private final njw g;
    private final njs h;
    private final njs i;
    private final ogf j;
    private final oco k;
    private final nyq l;
    private final oal m;
    private boolean n;
    private final int o;
    private final mrf p;

    public nyk(dxt dxtVar, ImageView imageView, njs njsVar, boolean z, odj odjVar, njw njwVar, njs njsVar2, njs njsVar3, ogf ogfVar, oco ocoVar, mrf mrfVar, int i, oal oalVar, nyq nyqVar) {
        super(imageView);
        this.n = false;
        this.c = dxtVar;
        this.d = njsVar;
        this.e = z;
        this.f = odjVar;
        this.g = njwVar;
        this.h = njsVar2;
        this.i = njsVar3;
        this.j = ogfVar;
        this.k = ocoVar;
        this.p = mrfVar;
        this.o = i;
        this.m = oalVar;
        this.l = nyqVar;
    }

    private static void p(AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, njv] */
    private final Drawable q(Drawable drawable, njs njsVar) {
        mrf mrfVar;
        if (drawable instanceof BitmapDrawable) {
            yqt yqtVarI = njsVar.k() ? yqt.i(njsVar.h()) : ypv.a;
            int iM = njsVar.m();
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Drawable drawableB = null;
            yqt yqtVarH = yqt.h(null);
            boolean z = yqtVarH.g() && ((ocm) yqtVarH.c()).d();
            boolean z2 = yqtVarH.g() && ((ocm) yqtVarH.c()).b();
            ImageView.ScaleType scaleTypeD = nyp.d(iM, z, z2, z2 ? ((ocm) yqtVarH.c()).a() : -1);
            if (scaleTypeD == ImageView.ScaleType.CENTER_INSIDE) {
                scaleTypeD = ImageView.ScaleType.FIT_CENTER;
            }
            if (yqtVarI.g() && (mrfVar = this.p) != null) {
                ?? C = yqtVarI.c();
                oal oalVar = this.m;
                int[] iArrF = C.f();
                if (iArrF.length != 0) {
                    int i = iArrF[0];
                    if (mij.a(i)) {
                        odl odlVar = (odl) mrfVar.a.get(Integer.valueOf(i));
                        if (odlVar == null) {
                            acwg acwgVar = acwg.a;
                            acvx acvxVar = new acvx();
                            acsw acswVar = acsw.LOG_TYPE_UNKNOWN_EXTENSION;
                            if ((Integer.MIN_VALUE & acvxVar.b.memoizedSerializedSize) == 0) {
                                acvxVar.y();
                            }
                            acwg acwgVar2 = (acwg) acvxVar.b;
                            acwgVar2.c = acswVar.E;
                            acwgVar2.b |= 2;
                            acvxVar.a(i);
                            mrfVar.c.c((acwg) acvxVar.v(), oalVar, "Unknown Flatbuffer extension in ImageProcessorExtensionResolver.", new Object[0]);
                        } else {
                            drawableB = odlVar.a(C.a(odlVar.b()), bitmap, scaleTypeD, oalVar);
                        }
                    } else {
                        yyk yykVarD = C.d(i);
                        Pair pair = (Pair) mrfVar.b.get(Integer.valueOf(i));
                        if (pair == null) {
                            acwg acwgVar3 = acwg.a;
                            acvx acvxVar2 = new acvx();
                            acsw acswVar2 = acsw.LOG_TYPE_UNKNOWN_EXTENSION;
                            if ((Integer.MIN_VALUE & acvxVar2.b.memoizedSerializedSize) == 0) {
                                acvxVar2.y();
                            }
                            acwg acwgVar4 = (acwg) acvxVar2.b;
                            acwgVar4.c = acswVar2.E;
                            acwgVar4.b |= 2;
                            acvxVar2.a(i);
                            mrfVar.c.c((acwg) acvxVar2.v(), oalVar, "ImageProcessorExtensionResolver: Unknown PB image processor extension.", new Object[0]);
                        } else {
                            try {
                                odk odkVar = (odk) pair.first;
                                ogw.a(yykVarD, (abyy) pair.second, ExtensionRegistryLite.getGeneratedRegistry());
                                drawableB = odkVar.b();
                            } catch (abxv unused) {
                                acwg acwgVar5 = acwg.a;
                                acvx acvxVar3 = new acvx();
                                acsw acswVar3 = acsw.LOG_TYPE_UNKNOWN_EXTENSION;
                                if ((Integer.MIN_VALUE & acvxVar3.b.memoizedSerializedSize) == 0) {
                                    acvxVar3.y();
                                }
                                acwg acwgVar6 = (acwg) acvxVar3.b;
                                acwgVar6.c = acswVar3.E;
                                acwgVar6.b |= 2;
                                acvxVar3.a(i);
                                mrfVar.c.c((acwg) acvxVar3.v(), oalVar, "Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver.", new Object[0]);
                            }
                        }
                    }
                }
            }
            drawable = drawableB == null ? new mjb(bitmap, scaleTypeD, this.k, yqtVarH) : drawableB;
            nyq nyqVar = this.l;
            if (nyqVar != null) {
                if (drawable instanceof mjb) {
                    ((mjb) drawable).h = nyqVar.a();
                }
                if (drawable instanceof mrd) {
                    ((mrd) drawable).i = nyqVar.a();
                }
            }
        } else if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            nfg nfgVarA = nym.a(njsVar);
            if (nfgVarA != null) {
                frameSequenceDrawable.setCornerRadius((int) TypedValue.applyDimension(1, nfgVarA.h(), ((ImageView) this.a).getContext().getResources().getDisplayMetrics()));
            }
        }
        if (!(drawable instanceof mjb)) {
            ((ImageView) this.a).setScaleType(nyp.d(njsVar.m(), false, false, -1));
        }
        drawable.setAutoMirrored(njsVar.j());
        nyp.c(drawable, njsVar);
        return drawable;
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void a(Drawable drawable) {
        njs njsVar;
        odj odjVar;
        o();
        if (!this.e && (odjVar = this.f) != null) {
            odjVar.a(this.a.hashCode(), this.d, this.g, null);
        }
        if (drawable != null && (njsVar = this.i) != null) {
            drawable = q(drawable, njsVar);
            if (jj$$ExternalSyntheticApiModelOutline0.m$1(drawable)) {
                p(jj$$ExternalSyntheticApiModelOutline0.m121m((Object) drawable));
            }
        }
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpb, defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        odj odjVar;
        odj odjVar2;
        Drawable drawableQ = (Drawable) obj;
        o();
        boolean z = this.e;
        if (!z && (odjVar2 = this.f) != null) {
            odjVar2.c(this.a.hashCode(), this.d, this.g, null, 0);
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) ((ImageView) this.a).getTag(R.id.elements_image_ready);
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        njs njsVar = this.d;
        if (njsVar != null) {
            drawableQ = q(drawableQ, njsVar);
        }
        super.b(drawableQ, dpmVar);
        final ogf ogfVar = this.j;
        if (ogfVar != null) {
            if (drawableQ instanceof FrameSequenceDrawable) {
                FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawableQ;
                ogfVar.b = frameSequenceDrawable;
                frameSequenceDrawable.setLoopBehavior(1);
                frameSequenceDrawable.setLoopCount(1);
                frameSequenceDrawable.setOnFinishedListener(new FrameSequenceDrawable.OnFinishedListener() { // from class: ogd
                    @Override // android.support.rastermill.FrameSequenceDrawable.OnFinishedListener
                    public final void onFinished(FrameSequenceDrawable frameSequenceDrawable2) {
                        ogf ogfVar2 = ogfVar;
                        CommandOuterClass$Command commandOuterClass$Command = ogfVar2.a;
                        if (commandOuterClass$Command != null) {
                            ogfVar2.d.a(commandOuterClass$Command, nzx.p().e()).k();
                        }
                        frameSequenceDrawable2.setLoopBehavior(1);
                        frameSequenceDrawable2.setLoopCount(1);
                        frameSequenceDrawable2.start();
                    }
                });
            } else if (drawableQ instanceof dlz) {
                dlz dlzVar = (dlz) drawableQ;
                ogfVar.c = dlzVar;
                dlzVar.c = 1;
                oge ogeVar = new oge(ogfVar);
                if (dlzVar.d == null) {
                    dlzVar.d = new ArrayList();
                }
                dlzVar.d.add(ogeVar);
            }
            int i = this.o;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                FrameSequenceDrawable frameSequenceDrawable2 = ogfVar.b;
                if (frameSequenceDrawable2 != null) {
                    frameSequenceDrawable2.start();
                    ogfVar.a();
                } else {
                    dlz dlzVar2 = ogfVar.c;
                    if (dlzVar2 != null) {
                        dlzVar2.start();
                        ogfVar.a();
                    }
                }
            } else if (i2 == 2) {
                ogfVar.b();
            }
        }
        if (!z || (odjVar = this.f) == null) {
            return;
        }
        this.a.hashCode();
        dxt dxtVar = this.c;
        new Size(dxtVar.a, dxtVar.b);
        this.m.R("null");
        odjVar.e(njsVar);
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void c(Drawable drawable) {
        njs njsVar;
        odj odjVar = this.f;
        if (odjVar != null) {
            odjVar.b(this.a.hashCode(), this.d, this.g);
        }
        if (drawable != null && (njsVar = this.h) != null) {
            drawable = q(drawable, njsVar);
        }
        super.c(drawable);
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void e(Drawable drawable) {
        njs njsVar;
        o();
        if (drawable != null && (njsVar = this.h) != null) {
            drawable = q(drawable, njsVar);
            if (jj$$ExternalSyntheticApiModelOutline0.m$1(drawable)) {
                p(jj$$ExternalSyntheticApiModelOutline0.m121m((Object) drawable));
            }
        }
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpi, defpackage.dpf
    public final void g(dpe dpeVar) {
        dxt dxtVar = this.c;
        dpeVar.e(dxtVar.a, dxtVar.b);
    }

    @Override // defpackage.dpb
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    final void o() {
        if (this.n) {
            return;
        }
        this.n = true;
        odj odjVar = this.f;
        if (odjVar != null) {
            View view = this.a;
            odjVar.d(view.hashCode(), this.d);
        }
    }
}
