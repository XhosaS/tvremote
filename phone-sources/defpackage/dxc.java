package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxc {
    public final Object a;

    public dxc(Object obj, byte[] bArr) {
        this.a = obj;
    }

    private static final String p(dze dzeVar) {
        String str = dzeVar.N;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String str2 = edt.a;
        Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
        String displayName = localeForLanguageTag.getDisplayName(locale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final dwt a(String str) {
        str.getClass();
        return (dwt) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void c() {
        ?? r0 = this.a;
        Iterator it = r0.values().iterator();
        while (it.hasNext()) {
            ((dwt) it.next()).u();
        }
        r0.clear();
    }

    public final byte[] d(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) ((LinkedHashMap) this.a).get(uri);
    }

    public final void e(Uri uri, byte[] bArr) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eer, java.lang.Object] */
    public final ees f() {
        return this.a.a();
    }

    public final int g() {
        return ((rld) this.a).a;
    }

    public final Bundle h() {
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        rld rldVar = (rld) this.a;
        ghf.c(bundleJ, "nav-entry-state:id", (String) rldVar.d);
        bundleJ.putInt("nav-entry-state:destination-id", rldVar.a);
        Object objJ = rldVar.c;
        if (objJ == null) {
            objJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        }
        ghf.a(bundleJ, "nav-entry-state:args", (Bundle) objJ);
        ghf.a(bundleJ, "nav-entry-state:saved-state", (Bundle) rldVar.b);
        return bundleJ;
    }

    public final String i() {
        return (String) ((rld) this.a).d;
    }

    public final String j(dze dzeVar) {
        int i = dzeVar.T;
        if (i == -1) {
            return "";
        }
        return ((Resources) this.a).getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String k(dze dzeVar) throws Resources.NotFoundException {
        String strM = m(p(dzeVar), l(dzeVar));
        if (!TextUtils.isEmpty(strM)) {
            return strM;
        }
        String str = dzeVar.L;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final String l(dze dzeVar) throws Resources.NotFoundException {
        int i = dzeVar.P;
        String string = (i & 2) != 0 ? ((Resources) this.a).getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = m(string, ((Resources) this.a).getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = m(string, ((Resources) this.a).getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? m(string, ((Resources) this.a).getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String m(String... strArr) throws Resources.NotFoundException {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.a).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public final void n(KeyEvent keyEvent) {
        ((MediaController) ((gag) this.a).c).dispatchMediaButtonEvent(keyEvent);
    }

    public final fwr o(cb cbVar, fxb fxbVar, dvd dvdVar, fww fwwVar) {
        cbVar.getClass();
        dvdVar.getClass();
        rld rldVar = (rld) this.a;
        Object obj = rldVar.c;
        if (obj != null) {
            ((Bundle) obj).setClassLoader(((Context) cbVar.a).getClassLoader());
        } else {
            obj = null;
        }
        return fus.P(cbVar, fxbVar, (Bundle) obj, dvdVar, fwwVar, (String) rldVar.d, (Bundle) rldVar.b);
    }

    public dxc(byte[] bArr, char[] cArr) {
        this.a = new nxb();
    }

    public dxc(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(getClass().getClassLoader());
        this.a = new rld(bundle);
    }

    public dxc(byte[] bArr) {
        this.a = new AtomicReference(null);
    }

    public dxc(char[] cArr) {
        this.a = new eqg();
    }

    public dxc() {
        this.a = new LinkedHashMap();
    }

    public dxc(Context context, fsd fsdVar) {
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new gag(context, fsdVar);
        } else {
            this.a = new gag(context, fsdVar);
        }
    }

    public dxc(dyo dyoVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dyoVar.g).setFlags(dyoVar.h).setUsage(dyoVar.i);
        if (Build.VERSION.SDK_INT >= 29) {
            usage.setAllowedCapturePolicy(dyoVar.j);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            usage.setSpatializationBehavior(dyoVar.k);
        }
        this.a = usage.build();
    }

    public dxc(fwr fwrVar) {
        fwrVar.getClass();
        this.a = new rld(fwrVar, fwrVar.a.b());
    }

    public dxc(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    public dxc(Object obj) {
        this.a = new WeakReference(obj);
    }

    public dxc(String str) {
        a.H(!TextUtils.isEmpty(str));
        this.a = str;
    }

    public dxc(short[] sArr) {
        this.a = new AtomicInteger(0);
    }

    public dxc(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(byte[] bArr, byte[] bArr2) {
        this.a = ImmutableSet.of(1, 5);
    }

    public dxc(yfo yfoVar, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dxc(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }
}
