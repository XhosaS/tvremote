package defpackage;

import android.content.Context;
import android.hardware.hdmi.HdmiControlManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioDeviceAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzt {
    public static bzt d;
    public final Object a;
    public final Object b;
    public final Object c;

    public bzt(ahm ahmVar, byj byjVar, Runnable runnable, byte[] bArr) {
        this.b = ahmVar;
        this.c = byjVar;
        this.a = runnable;
    }

    private final void p(String str) {
        ((blq) ((byj) this.a).a).c(str);
    }

    private static final byte[] q(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    final IllegalArgumentException a() {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final byte[] b(byte[] bArr) throws bll, NoSuchAlgorithmException {
        PublicKey publicKey = ((Certificate) this.b).getPublicKey();
        PublicKey publicKey2 = ((Certificate) this.c).getPublicKey();
        p("getAlpha, nonce=".concat(String.valueOf(bjz.b(bArr))));
        if (!(publicKey instanceof RSAPublicKey) || !(publicKey2 instanceof RSAPublicKey)) {
            throw new bll("Polo only supports RSA public keys");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        RSAPublicKey rSAPublicKey2 = (RSAPublicKey) publicKey2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] byteArray = rSAPublicKey.getModulus().abs().toByteArray();
            byte[] byteArray2 = rSAPublicKey.getPublicExponent().abs().toByteArray();
            byte[] byteArray3 = rSAPublicKey2.getModulus().abs().toByteArray();
            byte[] byteArray4 = rSAPublicKey2.getPublicExponent().abs().toByteArray();
            byte[] bArrQ = q(byteArray);
            byte[] bArrQ2 = q(byteArray2);
            byte[] bArrQ3 = q(byteArray3);
            byte[] bArrQ4 = q(byteArray4);
            bjz.b(bArrQ);
            bjz.b(bArrQ2);
            bjz.b(bArrQ3);
            bjz.b(bArrQ4);
            bjz.b(bArr);
            messageDigest.update(bArrQ);
            messageDigest.update(bArrQ2);
            messageDigest.update(bArrQ3);
            messageDigest.update(bArrQ4);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            p("Generated hash: ".concat(String.valueOf(bjz.b(bArrDigest))));
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            throw new bll("Could not get digest algorithm", e);
        }
    }

    public final boolean c() {
        Object obj = this.b;
        if (obj != null) {
            HdmiControlManager hdmiControlManager = (HdmiControlManager) obj;
            if (hdmiControlManager.getHdmiCecEnabled() == 1 && hdmiControlManager.getHdmiCecVolumeControlEnabled() == 1) {
                return true;
            }
        }
        return false;
    }

    public final int d(bgl bglVar) {
        return ((AudioManager) this.a).getDeviceVolumeBehavior(new AudioDeviceAttributes(2, bglVar.b, bglVar.c));
    }

    public final List e() {
        AudioDeviceInfo[] devices = ((AudioManager) this.a).getDevices(2);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(new bgl(audioDeviceInfo.getId(), audioDeviceInfo.getType(), Build.VERSION.SDK_INT < 28 ? null : audioDeviceInfo.getAddress(), audioDeviceInfo.getProductName().toString()));
        }
        return arrayList;
    }

    public final boolean f() {
        return ((AudioManager) this.a).isVolumeFixed();
    }

    public final Object g(Uri uri, bem bemVar) {
        return bemVar.a(o(uri));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bfi, java.lang.Object] */
    public final void h(Uri uri, Uri uri2) throws bew {
        cmt cmtVarO = o(uri);
        ?? r0 = cmtVarO.c;
        cmt cmtVarO2 = o(uri2);
        if (r0 != cmtVarO2.c) {
            throw new bew("Cannot rename file across backends");
        }
        r0.g((Uri) cmtVarO.d, (Uri) cmtVarO2.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bfi, java.lang.Object] */
    public final boolean i(Uri uri) throws bew {
        cmt cmtVarO = o(uri);
        return cmtVarO.c.f((Uri) cmtVarO.d);
    }

    public final boolean j(byo byoVar) {
        if (((asl) this.c).a().booleanValue()) {
            return ((asq) this.b).c.a == 2;
        }
        return atb.d((Context) this.a, (atc) byoVar.aL());
    }

    public final void k(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((am) ((byj) it.next()).a).P(menu, menuInflater);
        }
    }

    public final void l(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((am) ((byj) it.next()).a).R(menu);
        }
    }

    public final boolean m(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((am) ((byj) it.next()).a).Q(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final Location n(String str) {
        try {
            Object obj = this.a;
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public final cmt o(Uri uri) throws bew {
        bzs bzsVarN;
        int i = bzs.d;
        bzo bzoVar = new bzo();
        Pattern pattern = bfb.a;
        bzo bzoVar2 = new bzo();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            bzsVarN = cax.a;
        } else {
            String strSubstring = encodedFragment.substring(10);
            bdq.f(true, "The separator may not be the empty string.");
            byl bylVarA = byl.b("+".charAt(0)).a();
            strSubstring.getClass();
            bzsVarN = bzs.n(new byk(bylVarA, strSubstring));
        }
        int size = bzsVarN.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) bzsVarN.get(i2);
            Matcher matcher = bfb.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            bzoVar2.g(matcher.group(1));
        }
        bzs bzsVarF = bzoVar2.f();
        int i3 = ((cax) bzsVarF).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) bzsVarF.get(i4);
            bfn bfnVar = (bfn) this.c.get(str2);
            if (bfnVar == null) {
                throw new bew("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            bzoVar.g(bfnVar);
        }
        bzs bzsVarH = bzoVar.f().h();
        doc docVar = new doc();
        String scheme = uri.getScheme();
        bfi bfiVar = (bfi) this.a.get(scheme);
        if (bfiVar == null) {
            throw new bew(String.format("Requested backend isn't registered: %s", scheme));
        }
        docVar.b = bfiVar;
        docVar.c = this.b;
        docVar.d = bzsVarH;
        if (!bzsVarH.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strB = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = bzsVarH.listIterator(bzsVarH.size());
                while (listIterator.hasPrevious()) {
                    strB = ((bfn) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        docVar.a = uri;
        return new cmt(docVar);
    }

    public bzt(Context context, LocationManager locationManager) {
        this.b = new cp();
        this.c = context;
        this.a = locationManager;
    }

    public bzt(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.c = cpmVar2;
        this.b = cpmVar3;
    }

    public bzt(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public bzt(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public bzt(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public bzt(ckv ckvVar, final String str, final String str2) {
        this.c = cga.a;
        this.b = bit.k(new ayj(this, ckvVar, 2, null));
        this.a = bit.k(new byo() { // from class: bbp
            @Override // defpackage.byo
            public final Object aL() {
                int i = cfu.a;
                int i2 = cfw.a;
                cft cftVarA = new cfv().a(str.getBytes());
                cftVarA.g();
                return ((cga) this.c.c).b((byte[]) ((cfr) cftVarA.a(str2.getBytes()).c()).a.clone());
            }
        });
    }

    public bzt(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public bzt(List list) {
        List<bfn> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.c = new HashMap();
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bfi bfiVar = (bfi) it.next();
            if (TextUtils.isEmpty(bfiVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                bfi bfiVar2 = (bfi) this.a.put(bfiVar.e(), bfiVar);
                if (bfiVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + bfiVar2.getClass().getCanonicalName() + " with " + bfiVar.getClass().getCanonicalName());
                }
            }
        }
        for (bfn bfnVar : list2) {
            if (TextUtils.isEmpty(bfnVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                bfn bfnVar2 = (bfn) this.c.put(bfnVar.a(), bfnVar);
                if (bfnVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + bfnVar2.getClass().getCanonicalName() + " with " + bfnVar.getClass().getCanonicalName());
                }
            }
        }
        this.b.addAll(list3);
    }

    public bzt(Context context, byte[] bArr) {
        bgx bgxVarA;
        bit bitVar;
        this.c = new HashMap();
        this.a = (AudioManager) context.getSystemService(AudioManager.class);
        try {
            if ((!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 31) && (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
                bitVar = ((!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 30) && Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z') ? new bit() : new bit();
            } else {
                bitVar = new bgv();
            }
            bgxVarA = bitVar.a(context);
        } catch (bgu unused) {
            bgxVarA = null;
        }
        this.b = bgxVarA;
    }

    public bzt(Context context) {
        this.c = new HashMap();
        this.b = (HdmiControlManager) context.getSystemService(HdmiControlManager.class);
        this.a = context.getContentResolver();
    }
}
