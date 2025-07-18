package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlp implements jiq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/UiClientOpHandler");
    public static final Duration b;
    private static final ActionExecutor.SupportedAction i;
    private static final ActionExecutor.SupportedAction j;
    private static final ActionExecutor.SupportedAction k;
    private static final ActionExecutor.SupportedAction l;
    private static final ActionExecutor.SupportedAction m;
    private static final ActionExecutor.SupportedAction n;
    private static final ActionExecutor.SupportedAction o;
    private static final ActionExecutor.SupportedAction p;
    private static final ActionExecutor.SupportedAction q;
    private static final ActionExecutor.SupportedAction r;
    private static final ActionExecutor.SupportedAction s;
    private static final ActionExecutor.SupportedAction t;
    private final joc A;
    private final fry B;
    private final Supplier C;
    private final agow D;
    private final jhs E;
    private final gph F;
    private final gzu G;
    private final hxv H;
    private final exl I;
    private final gtu J;
    private final agow K;
    private final jmc L;
    private final jbc M;
    private final agow N;
    private final fex O;
    private final lzb P;
    private final fbf Q;
    private final agow R;
    private abvo S;
    private final String T;
    private final euk U;
    public final agow c;
    public final jlr d;
    public final fba e;
    public final irr f;
    public byte[] g;
    public final gsl h;
    private final ActivityManager u;
    private final fiu v;
    private final Supplier w;
    private final Context x;
    private final agte y;
    private final agte z;

    static {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        i = jhy.a.b(fbo.S, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("androidtv.VoiceSearchResponse", "athome.voice.VoiceSearchResponse")}, "", new byte[0]);
        j = jhy.a.b(fbo.T, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_disclaimers_args", "assistant.api.client_op.ui.ShowDisclaimersArgs")}, "", new byte[0]);
        jhy jhyVar = jhy.a;
        fbo fboVar = fbo.W;
        ActionExecutor.SupportedAction.Arg[] argArr = {new ActionExecutor.SupportedAction.Arg("show_media_browse_args", "assistant.api.client_op.ui.ShowMediaBrowseArgs")};
        xog xogVar = xog.a;
        xoe xoeVar = new xoe();
        if ((xoeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xoeVar.y();
        }
        xog xogVar2 = (xog) xoeVar.b;
        xogVar2.b |= 1;
        xogVar2.c = true;
        abxd abxdVarV = xoeVar.v();
        abxdVarV.getClass();
        xog xogVar3 = (xog) abxdVarV;
        try {
            int i2 = xogVar3.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xogVar3.getClass()).a(xogVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xogVar3.getClass()).a(xogVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xogVar3.memoizedSerializedSize = (xogVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xogVar3.getClass()).m(xogVar3, abwa.a(abvwVar));
            abvwVar.K();
            k = jhyVar.b(fboVar, argArr, "assistant.api.client_op.ShowMediaBrowseProperties", bArr);
            l = jhy.a.b(fbo.U, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_filters_args", "assistant.api.client_op.ShowFiltersArgs")}, "", new byte[0]);
            m = jhy.a.b(fbo.V, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_images_args", "assistant.api.client_op.ui.ShowImagesArgs")}, "", new byte[0]);
            n = jhy.a.b(fbo.X, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("notification_args", "assistant.api.client_op.NotificationArgs")}, "", new byte[0]);
            jhy jhyVar2 = jhy.a;
            fbo fboVar2 = fbo.Y;
            ActionExecutor.SupportedAction.Arg[] argArr2 = {new ActionExecutor.SupportedAction.Arg("show_rendered_elements_card_args", "assistant.api.client_op.ShowRenderedCardArgs")};
            xhi xhiVar = xhi.a;
            xhf xhfVar = new xhf();
            xhh xhhVar = xhh.ELEMENTS;
            if ((xhfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhfVar.y();
            }
            xhi xhiVar2 = (xhi) xhfVar.b;
            xhhVar.getClass();
            abxj abxjVar = xhiVar2.c;
            if (!abxjVar.c()) {
                int size = abxjVar.size();
                xhiVar2.c = abxjVar.d(size + size);
            }
            xhiVar2.c.h(xhhVar.f);
            xlf xlfVar = xlf.a;
            xlf xlfVarA = xlg.a(new xle());
            if ((xhfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhfVar.y();
            }
            xhi xhiVar3 = (xhi) xhfVar.b;
            xhiVar3.d = xlfVarA;
            xhiVar3.b |= 4;
            xhk xhkVar = xhk.a;
            xhj xhjVar = new xhj();
            if ((xhjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhjVar.y();
            }
            xhk xhkVar2 = (xhk) xhjVar.b;
            xhkVar2.b |= 1;
            xhkVar2.c = true;
            if ((xhjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhjVar.y();
            }
            xhk xhkVar3 = (xhk) xhjVar.b;
            xhkVar3.b |= 2;
            xhkVar3.d = true;
            if ((xhjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhjVar.y();
            }
            xhk xhkVar4 = (xhk) xhjVar.b;
            xhkVar4.b |= 4;
            xhkVar4.e = 3;
            if ((xhfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhfVar.y();
            }
            xhi xhiVar4 = (xhi) xhfVar.b;
            xhk xhkVar5 = (xhk) xhjVar.v();
            xhkVar5.getClass();
            xhiVar4.e = xhkVar5;
            xhiVar4.b |= 32;
            xhi xhiVar5 = (xhi) xhfVar.v();
            try {
                int i3 = xhiVar5.memoizedSerializedSize;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(xhiVar5.getClass()).a(xhiVar5);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA2 = i3 & Integer.MAX_VALUE;
                    if (iA2 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(xhiVar5.getClass()).a(xhiVar5);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                        xhiVar5.memoizedSerializedSize = (xhiVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                    }
                }
                byte[] bArr2 = new byte[iA2];
                abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                abza.a.a(xhiVar5.getClass()).m(xhiVar5, abwa.a(abvwVar2));
                abvwVar2.K();
                o = jhyVar2.b(fboVar2, argArr2, "assistant.api.client_op.ShowRenderedCardProperties", bArr2);
                jhy jhyVar3 = jhy.a;
                fbo fboVar3 = fbo.Y;
                ActionExecutor.SupportedAction.Arg[] argArr3 = {new ActionExecutor.SupportedAction.Arg("show_rendered_html_card_args", "assistant.api.client_op.ShowRenderedCardArgs"), new ActionExecutor.SupportedAction.Arg("show_rendered_elements_card_args", "assistant.api.client_op.ShowRenderedCardArgs")};
                xhf xhfVar2 = new xhf();
                List listD = agqq.d(xhh.ANDROID, xhh.ELEMENTS, xhh.WEB);
                if ((xhfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhfVar2.y();
                }
                xhi xhiVar6 = (xhi) xhfVar2.b;
                abxj abxjVar2 = xhiVar6.c;
                if (!abxjVar2.c()) {
                    int size2 = abxjVar2.size();
                    xhiVar6.c = abxjVar2.d(size2 + size2);
                }
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    xhiVar6.c.h(((xhh) it.next()).f);
                }
                xlf xlfVarA2 = xlg.a(new xle());
                if ((xhfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhfVar2.y();
                }
                xhi xhiVar7 = (xhi) xhfVar2.b;
                xhiVar7.d = xlfVarA2;
                xhiVar7.b |= 4;
                xhj xhjVar2 = new xhj();
                if ((xhjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhjVar2.y();
                }
                xhk xhkVar6 = (xhk) xhjVar2.b;
                xhkVar6.b |= 1;
                xhkVar6.c = false;
                if ((xhjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhjVar2.y();
                }
                xhk xhkVar7 = (xhk) xhjVar2.b;
                xhkVar7.b |= 2;
                xhkVar7.d = true;
                if ((xhjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhjVar2.y();
                }
                xhk xhkVar8 = (xhk) xhjVar2.b;
                xhkVar8.b |= 4;
                xhkVar8.e = 3;
                if ((xhfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xhfVar2.y();
                }
                xhi xhiVar8 = (xhi) xhfVar2.b;
                xhk xhkVar9 = (xhk) xhjVar2.v();
                xhkVar9.getClass();
                xhiVar8.e = xhkVar9;
                xhiVar8.b |= 32;
                xhi xhiVar9 = (xhi) xhfVar2.v();
                try {
                    int i4 = xhiVar9.memoizedSerializedSize;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        iA3 = abza.a.a(xhiVar9.getClass()).a(xhiVar9);
                        if (iA3 < 0) {
                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA3 = i4 & Integer.MAX_VALUE;
                        if (iA3 == Integer.MAX_VALUE) {
                            iA3 = abza.a.a(xhiVar9.getClass()).a(xhiVar9);
                            if (iA3 < 0) {
                                throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                            }
                            xhiVar9.memoizedSerializedSize = (xhiVar9.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                        }
                    }
                    byte[] bArr3 = new byte[iA3];
                    abvw abvwVar3 = new abvw(bArr3, 0, iA3);
                    abza.a.a(xhiVar9.getClass()).m(xhiVar9, abwa.a(abvwVar3));
                    abvwVar3.K();
                    p = jhyVar3.b(fboVar3, argArr3, "assistant.api.client_op.ShowRenderedCardProperties", bArr3);
                    jhy jhyVar4 = jhy.a;
                    fbo fboVar4 = fbo.Z;
                    ActionExecutor.SupportedAction.Arg[] argArr4 = {new ActionExecutor.SupportedAction.Arg("show_shelves_args", "assistant.api.client_op.ui.ShowShelvesArgs")};
                    xon xonVar = xon.a;
                    xom xomVar = new xom();
                    DesugarCollections.unmodifiableList(((xon) xomVar.b).b).getClass();
                    abxk abxkVar = xoj.a;
                    xoi xoiVar = new xoi();
                    String strA = fbo.Y.a();
                    if ((xoiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xoiVar.y();
                    }
                    xoj xojVar = (xoj) xoiVar.b;
                    xojVar.c = 1;
                    xojVar.d = strA;
                    new abxl(xojVar.e, xoj.a);
                    xol xolVar = xol.ELEMENTS;
                    xolVar.getClass();
                    if ((xoiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xoiVar.y();
                    }
                    xoj xojVar2 = (xoj) xoiVar.b;
                    abxj abxjVar3 = xojVar2.e;
                    if (!abxjVar3.c()) {
                        int size3 = abxjVar3.size();
                        xojVar2.e = abxjVar3.d(size3 + size3);
                    }
                    xojVar2.e.h(xolVar.d);
                    xomVar.a(xkm.a(xoiVar));
                    DesugarCollections.unmodifiableList(((xon) xomVar.b).b).getClass();
                    xoi xoiVar2 = new xoi();
                    String strA2 = fbo.W.a();
                    if ((xoiVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xoiVar2.y();
                    }
                    xoj xojVar3 = (xoj) xoiVar2.b;
                    xojVar3.c = 1;
                    xojVar3.d = strA2;
                    xomVar.a(xkm.a(xoiVar2));
                    abxd abxdVarV2 = xomVar.v();
                    abxdVarV2.getClass();
                    xon xonVar2 = (xon) abxdVarV2;
                    try {
                        int i5 = xonVar2.memoizedSerializedSize;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            iA4 = abza.a.a(xonVar2.getClass()).a(xonVar2);
                            if (iA4 < 0) {
                                throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA4 = i5 & Integer.MAX_VALUE;
                            if (iA4 == Integer.MAX_VALUE) {
                                iA4 = abza.a.a(xonVar2.getClass()).a(xonVar2);
                                if (iA4 < 0) {
                                    throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                }
                                xonVar2.memoizedSerializedSize = (xonVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA4;
                            }
                        }
                        byte[] bArr4 = new byte[iA4];
                        abvz abvzVarJ = abvz.J(bArr4);
                        abza.a.a(xonVar2.getClass()).m(xonVar2, abwa.a(abvzVarJ));
                        abvzVarJ.K();
                        q = jhyVar4.b(fboVar4, argArr4, "assistant.api.client_op.ShowShelvesProperties", bArr4);
                        jhy jhyVar5 = jhy.a;
                        fbo fboVar5 = fbo.ab;
                        ActionExecutor.SupportedAction.Arg[] argArr5 = {new ActionExecutor.SupportedAction.Arg("show_suggestions_args", "assistant.api.client_op.ShowSuggestionsArgs")};
                        abxk abxkVar2 = xot.a;
                        xoq xoqVar = new xoq(null);
                        xou.c(xoqVar);
                        xou.b(xos.ANDROID_TV, xoqVar);
                        xot xotVarA = xou.a(xoqVar);
                        try {
                            int i6 = xotVarA.memoizedSerializedSize;
                            if ((i6 & Integer.MIN_VALUE) != 0) {
                                iA5 = abza.a.a(xotVarA.getClass()).a(xotVarA);
                                if (iA5 < 0) {
                                    throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA5 = i6 & Integer.MAX_VALUE;
                                if (iA5 == Integer.MAX_VALUE) {
                                    iA5 = abza.a.a(xotVarA.getClass()).a(xotVarA);
                                    if (iA5 < 0) {
                                        throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                                    }
                                    xotVarA.memoizedSerializedSize = (xotVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA5;
                                }
                            }
                            byte[] bArr5 = new byte[iA5];
                            abvz abvzVarJ2 = abvz.J(bArr5);
                            abza.a.a(xotVarA.getClass()).m(xotVarA, abwa.a(abvzVarJ2));
                            abvzVarJ2.K();
                            r = jhyVar5.b(fboVar5, argArr5, "assistant.api.client_op.ShowSuggestionsProperties", bArr5);
                            s = jhy.a.b(fbo.ac, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_text_args", "assistant.api.client_op.ShowTextArgs")}, "", new byte[0]);
                            t = jhy.a.b(fbo.ad, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_toast_args", "assistant.api.client_op.ShowToastArgs")}, "", new byte[0]);
                        } catch (IOException e) {
                            throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xotVarA), e);
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xonVar2), e2);
                    }
                } catch (IOException e3) {
                    throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xhiVar9), e3);
                }
            } catch (IOException e4) {
                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xhiVar5), e4);
            }
        } catch (IOException e5) {
            throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xogVar3), e5);
        }
    }

    public jlp(ActivityManager activityManager, agow agowVar, fiu fiuVar, jlr jlrVar, Supplier supplier, fba fbaVar, Context context, agte agteVar, agte agteVar2, euk eukVar, joc jocVar, fry fryVar, Supplier supplier2, agow agowVar2, jhs jhsVar, gph gphVar, gzu gzuVar, hxv hxvVar, exl exlVar, gtu gtuVar, agow agowVar3, jmc jmcVar, jbc jbcVar, agow agowVar4, fex fexVar, irr irrVar, lzb lzbVar, gsl gslVar, fbf fbfVar, agow agowVar5) {
        activityManager.getClass();
        agowVar.getClass();
        fiuVar.getClass();
        jlrVar.getClass();
        fbaVar.getClass();
        context.getClass();
        agteVar.getClass();
        agteVar2.getClass();
        eukVar.getClass();
        jocVar.getClass();
        jhsVar.getClass();
        gzuVar.getClass();
        hxvVar.getClass();
        gtuVar.getClass();
        jmcVar.getClass();
        agowVar4.getClass();
        fexVar.getClass();
        lzbVar.getClass();
        fbfVar.getClass();
        agowVar5.getClass();
        this.u = activityManager;
        this.c = agowVar;
        this.v = fiuVar;
        this.d = jlrVar;
        this.w = supplier;
        this.e = fbaVar;
        this.x = context;
        this.y = agteVar;
        this.z = agteVar2;
        this.U = eukVar;
        this.A = jocVar;
        this.B = fryVar;
        this.C = supplier2;
        this.D = agowVar2;
        this.E = jhsVar;
        this.F = gphVar;
        this.G = gzuVar;
        this.H = hxvVar;
        this.I = exlVar;
        this.J = gtuVar;
        this.K = agowVar3;
        this.L = jmcVar;
        this.M = jbcVar;
        this.N = agowVar4;
        this.O = fexVar;
        this.f = irrVar;
        this.P = lzbVar;
        this.h = gslVar;
        this.Q = fbfVar;
        this.R = agowVar5;
        this.T = "UiClientOpHandler";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] j(java.util.Map r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.j(java.util.Map, java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d1 A[Catch: IOException -> 0x04ef, TryCatch #6 {IOException -> 0x04ef, blocks: (B:154:0x02cb, B:156:0x02d1, B:168:0x0318, B:159:0x02e2, B:160:0x02ed, B:161:0x02ee, B:163:0x02f4, B:165:0x0304, B:166:0x030c, B:167:0x0317), top: B:236:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ee A[Catch: IOException -> 0x04ef, TryCatch #6 {IOException -> 0x04ef, blocks: (B:154:0x02cb, B:156:0x02d1, B:168:0x0318, B:159:0x02e2, B:160:0x02ed, B:161:0x02ee, B:163:0x02f4, B:165:0x0304, B:166:0x030c, B:167:0x0317), top: B:236:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0390 A[Catch: IOException -> 0x04e4, TryCatch #11 {IOException -> 0x04e4, blocks: (B:178:0x038a, B:180:0x0390, B:192:0x03d7, B:183:0x03a1, B:184:0x03ac, B:185:0x03ad, B:187:0x03b3, B:189:0x03c3, B:190:0x03cb, B:191:0x03d6), top: B:241:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ad A[Catch: IOException -> 0x04e4, TryCatch #11 {IOException -> 0x04e4, blocks: (B:178:0x038a, B:180:0x0390, B:192:0x03d7, B:183:0x03a1, B:184:0x03ac, B:185:0x03ad, B:187:0x03b3, B:189:0x03c3, B:190:0x03cb, B:191:0x03d6), top: B:241:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0443 A[Catch: IOException -> 0x04d9, TryCatch #1 {IOException -> 0x04d9, blocks: (B:197:0x043d, B:199:0x0443, B:211:0x048a, B:202:0x0454, B:203:0x045f, B:204:0x0460, B:206:0x0466, B:208:0x0476, B:209:0x047e, B:210:0x0489), top: B:230:0x043d }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0460 A[Catch: IOException -> 0x04d9, TryCatch #1 {IOException -> 0x04d9, blocks: (B:197:0x043d, B:199:0x0443, B:211:0x048a, B:202:0x0454, B:203:0x045f, B:204:0x0460, B:206:0x0466, B:208:0x0476, B:209:0x047e, B:210:0x0489), top: B:230:0x043d }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b A[Catch: IOException -> 0x04fa, TryCatch #2 {IOException -> 0x04fa, blocks: (B:69:0x0195, B:71:0x019b, B:83:0x01e2, B:74:0x01ac, B:75:0x01b7, B:76:0x01b8, B:78:0x01be, B:80:0x01ce, B:81:0x01d6, B:82:0x01e1), top: B:231:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8 A[Catch: IOException -> 0x04fa, TryCatch #2 {IOException -> 0x04fa, blocks: (B:69:0x0195, B:71:0x019b, B:83:0x01e2, B:74:0x01ac, B:75:0x01b7, B:76:0x01b8, B:78:0x01be, B:80:0x01ce, B:81:0x01d6, B:82:0x01e1), top: B:231:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
    
        if (r2.a(r3, r7, r4) != r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0217, code lost:
    
        if (r0.a(r2, r3, r4) != r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021f, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r17, java.util.Map r18, com.google.assistant.sdk.libassistant.ActionExecutor.ResponseParams r19, defpackage.gez r20, defpackage.agsw r21) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.b(java.lang.String, java.util.Map, com.google.assistant.sdk.libassistant.ActionExecutor$ResponseParams, gez, agsw):java.lang.Object");
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.T;
    }

    @Override // defpackage.jiq
    public final List d() {
        agrx agrxVar = new agrx(10);
        agrxVar.addAll(agqq.d(i, j, k, q, r, t));
        int iOrdinal = this.F.ordinal();
        if (iOrdinal == 0) {
            agrxVar.add(o);
            agrxVar.add(l);
            agrxVar.add(m);
        } else if (iOrdinal != 1) {
            agrxVar.add(o);
        } else {
            agrxVar.add(p);
        }
        if (((Boolean) this.R.a()).booleanValue()) {
            agrxVar.add(n);
        }
        if (!this.H.b()) {
            agrxVar.add(s);
        }
        return agqq.a(agrxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r17, java.util.Map r18, defpackage.gez r19, defpackage.agsw r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.e(java.lang.String, java.util.Map, gez, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.f(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r8, defpackage.agsw r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.g(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r14 != r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (r14 == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0111, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0102 -> B:50:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0152 -> B:65:0x0153). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.h(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r10, defpackage.agsw r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlp.i(java.lang.String, agsw):java.lang.Object");
    }
}
