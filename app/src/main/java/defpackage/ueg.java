package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueg {
    private final Map a;
    private final Map b;
    private final List c;

    public ueg(List list) {
        this(list, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    private static final Uri k(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final uee l(Uri uri) throws ufx {
        yyk yykVarN = n(uri);
        ued uedVar = new ued();
        uedVar.a = this;
        uedVar.b = m(uri.getScheme());
        uedVar.d = this.c;
        uedVar.c = yykVarN;
        uedVar.e = uri;
        if (!yykVarN.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = yykVarN.listIterator(yykVarN.size());
                while (listIterator.hasPrevious()) {
                    ((uhv) listIterator.previous()).f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        uedVar.f = uri;
        return new uee(uedVar);
    }

    private final uhp m(String str) throws ufx {
        uhp uhpVar = (uhp) this.a.get(str);
        if (uhpVar != null) {
            return uhpVar;
        }
        throw new ufx(String.format("Requested backend isn't registered: %s", str));
    }

    private final yyk n(Uri uri) throws ufx {
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        Pattern pattern = ugf.a;
        yyf yyfVar2 = new yyf(4);
        String encodedFragment = uri.getEncodedFragment();
        yyk yykVarI = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? zcg.b : yyk.i(yrl.c("+").a().e(encodedFragment.substring(10)));
        int size = yykVarI.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) yykVarI.get(i2);
            Matcher matcher = ugf.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            yyfVar2.g(matcher.group(1));
        }
        yyk yykVarF = yyfVar2.f();
        int i3 = ((zcg) yykVarF).d;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) yykVarF.get(i4);
            uhv uhvVar = (uhv) this.b.get(str2);
            if (uhvVar == null) {
                throw new ufx(a.r(uri, str2, "Requested transform isn't registered: ", ": "));
            }
            yyfVar.g(uhvVar);
        }
        return yyfVar.f().a();
    }

    public final long a(Uri uri) throws ufx {
        uee ueeVarL = l(uri);
        return ueeVarL.b.a(ueeVarL.f);
    }

    public final Iterable b(Uri uri) throws ufx {
        uhp uhpVarM = m(uri.getScheme());
        yyk yykVarN = n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = uhpVarM.g(k(uri)).iterator();
        while (it.hasNext()) {
            Uri uriBuild = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!yykVarN.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(uriBuild.getPathSegments());
                if (!arrayList2.isEmpty() && !uriBuild.getPath().endsWith("/")) {
                    String str = (String) zag.e(arrayList2);
                    Iterator it2 = yykVarN.iterator();
                    while (it2.hasNext()) {
                        ((uhv) it2.next()).e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    uriBuild = uriBuild.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(uriBuild);
        }
        return arrayList;
    }

    public final Object c(Uri uri, uef uefVar) {
        return uefVar.a(l(uri));
    }

    public final void d(Uri uri) {
        m(uri.getScheme()).i(k(uri));
    }

    public final void e(Uri uri) {
        m(uri.getScheme()).j(k(uri));
    }

    public final void f(Uri uri) throws ufx {
        uee ueeVarL = l(uri);
        ueeVarL.b.k(ueeVarL.f);
    }

    public final void g(Uri uri, Uri uri2) throws ufx {
        uee ueeVarL = l(uri);
        uhp uhpVar = ueeVarL.b;
        uee ueeVarL2 = l(uri2);
        if (uhpVar != ueeVarL2.b) {
            throw new ufx("Cannot rename file across backends");
        }
        uhpVar.l(ueeVarL.f, ueeVarL2.f);
    }

    public final boolean h(Uri uri) throws ufx {
        uee ueeVarL = l(uri);
        return ueeVarL.b.m(ueeVarL.f);
    }

    public final boolean i(Uri uri) {
        return m(uri.getScheme()).n(k(uri));
    }

    @Deprecated
    public final void j(Uri uri) throws ufx {
        if (h(uri)) {
            if (!i(uri)) {
                f(uri);
                return;
            }
            Iterator it = b(uri).iterator();
            while (it.hasNext()) {
                j((Uri) it.next());
            }
            e(uri);
        }
    }

    public ueg(List list, List list2, List list3) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uhp uhpVar = (uhp) it.next();
            if (TextUtils.isEmpty(uhpVar.h())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                uhp uhpVar2 = (uhp) this.a.put(uhpVar.h(), uhpVar);
                if (uhpVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + uhpVar2.getClass().getCanonicalName() + " with " + uhpVar.getClass().getCanonicalName());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            uhv uhvVar = (uhv) it2.next();
            if (TextUtils.isEmpty(uhvVar.c())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                uhv uhvVar2 = (uhv) this.b.put(uhvVar.c(), uhvVar);
                if (uhvVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + uhvVar2.getClass().getCanonicalName() + " with " + uhvVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }
}
