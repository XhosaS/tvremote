package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbj implements idf {
    private final /* synthetic */ int a;
    private final Object b;

    public lbj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static idf a(Class cls) {
        return new lbj(new lbi(cls), 9);
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v77, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.lang.Object, vvq] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) throws IOException {
        int i;
        int i2 = 8;
        byte[] bArr = null;
        int i3 = 5;
        int i4 = 2;
        switch (this.a) {
            case 0:
                kzw kzwVar = (kzw) obj;
                if (kaf.k(kzwVar.b) == 1 && ((Class) this.b).isAssignableFrom(lbl.class)) {
                    return ieg.f(kzwVar.b == 1 ? (lbl) kzwVar.c : lbl.a);
                }
                if (kaf.k(kzwVar.b) == 2 && ((Class) this.b).isAssignableFrom(lcg.class)) {
                    return ieg.f(kzwVar.b == 2 ? (lcg) kzwVar.c : lcg.a);
                }
                int i5 = kzwVar.b;
                if (kaf.k(i5) == 3 && this.b == lcd.class) {
                    return ieg.f(i5 == 3 ? (lcd) kzwVar.c : lcd.a);
                }
                if (kaf.k(i5) == 4 && ((Class) this.b).isAssignableFrom(lau.class)) {
                    return ieg.f(kzwVar.b == 4 ? (lau) kzwVar.c : lau.a);
                }
                if (kaf.k(kzwVar.b) == 5 && ((Class) this.b).isAssignableFrom(lbr.class)) {
                    return ieg.f(kzwVar.b == 5 ? (lbr) kzwVar.c : lbr.a);
                }
                throw new ClassCastException("Expected " + this.b.toString() + " but got " + kaf.j(kaf.k(kzwVar.b)));
            case 1:
                xax xaxVar = (xax) obj;
                xaz xazVar = xaxVar.c;
                if (xazVar == null) {
                    xazVar = xaz.a;
                }
                int i6 = xaxVar.b;
                if ((i6 & 16) == 0 || (i6 & 1) == 0) {
                    return ieg.b(new RuntimeException("Incomplete android app asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
                }
                if ((8 & xazVar.b) != 0) {
                    xay xayVarB = xay.b(xazVar.f);
                    if (xayVarB == null) {
                        xayVarB = xay.ANDROID_APP;
                    }
                    if (xayVarB == xay.ANDROID_APP) {
                        xar xarVar = xaxVar.g;
                        if (xarVar == null) {
                            xarVar = xar.a;
                        }
                        vtw vtwVarM = kzi.a.m();
                        kzk kzkVarG = lbk.g(xazVar.c);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar = vtwVarM.b;
                        kzi kziVar = (kzi) vucVar;
                        kzkVarG.getClass();
                        kziVar.c = kzkVarG;
                        kziVar.b |= 1;
                        String str = xarVar.c;
                        if (!vucVar.A()) {
                            vtwVarM.u();
                        }
                        kzi kziVar2 = (kzi) vtwVarM.b;
                        str.getClass();
                        kziVar2.d = str;
                        lcr lcrVarP = lbk.p((Uri) this.b.b(xarVar.h));
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        kzi kziVar3 = (kzi) vtwVarM.b;
                        lcrVarP.getClass();
                        kziVar3.e = lcrVarP;
                        kziVar3.b |= 2;
                        return ieg.f((kzi) vtwVarM.r());
                    }
                }
                return ieg.b(new RuntimeException("Asset resource not android app: ".concat(String.valueOf(String.valueOf(xaxVar)))));
            case 2:
                return new BitmapDrawable(((Context) this.b).getResources(), (Bitmap) obj);
            case 3:
                File file = (File) obj;
                return (file.exists() && file.isDirectory()) ? ieg.f(Long.valueOf(((egc) this.b.b(file)).a())) : ieg.b(new IOException("ExoCache not found"));
            case 4:
                sro sroVar = (sro) obj;
                ieg iegVar = (ieg) this.b.b(new kuw(sroVar.d, sroVar.b));
                if (!iegVar.m()) {
                    iegVar.p();
                    return iegVar;
                }
                try {
                    HashMap map = new HashMap();
                    for (xax xaxVar2 : (List) iegVar.g()) {
                        xaz xazVar2 = xaxVar2.c;
                        if (xazVar2 == null) {
                            xazVar2 = xaz.a;
                        }
                        if (xazVar2.d.isEmpty()) {
                            throw new vuq("Stored AssetResource has no MID");
                        }
                        xaz xazVar3 = xaxVar2.c;
                        if (xazVar3 == null) {
                            xazVar3 = xaz.a;
                        }
                        map.put(xazVar3.d, xaxVar2);
                    }
                    return ieg.f(map);
                } catch (IOException e) {
                    return ieg.b(e);
                }
            case 5:
                cui cuiVar = (cui) obj;
                try {
                    return ieg.f(new File(new File(kfw.M((Context) this.b, ((Integer) cuiVar.b).intValue()), "knowledge"), (String) cuiVar.a));
                } catch (lkb e2) {
                    return ieg.b(e2);
                }
            case 6:
                lxo lxoVar = (lxo) obj;
                lxx lxxVar = new lxx((String) this.b);
                lxxVar.c("id", lxoVar.a());
                lxxVar.a = lxoVar.c;
                lxxVar.b = lxoVar.e;
                lxxVar.b(lxoVar.d);
                lxxVar.c = lxoVar.f;
                return mfp.a(lxxVar.a());
            case 7:
                xag xagVar = (xag) obj;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                long j = xagVar.b;
                if (j <= 0) {
                    krd.f(a.cs(j, "Asset expiration time is not valid: "));
                    j = 86400 + seconds;
                } else if (j < seconds) {
                    krd.f(a.cs(j, "Asset expiration time is in the past: "));
                }
                long j2 = j;
                vun<xax> vunVar = xagVar.c;
                Object obj2 = this.b;
                HashMap map2 = new HashMap();
                for (xax xaxVar3 : vunVar) {
                    xaz xazVar4 = xaxVar3.c;
                    if (xazVar4 == null) {
                        xazVar4 = xaz.a;
                    }
                    map2.put(ksy.b(xazVar4), xaxVar3);
                }
                kzx kzxVar = new kzx(new lxt(map2, i2), (kta) ((kdh) obj2).a);
                ArrayList arrayList = new ArrayList(vunVar.size());
                for (xax xaxVar4 : vunVar) {
                    ieg iegVar2 = (ieg) kzxVar.b(xaxVar4);
                    if (iegVar2.m()) {
                        xaz xazVar5 = xaxVar4.c;
                        if (xazVar5 == null) {
                            xazVar5 = xaz.a;
                        }
                        arrayList.add(new lyj(lyc.a(ksy.b(xazVar5)), (kzw) iegVar2.g(), seconds, j2));
                    } else {
                        krd.d("Failed to convert asset to CacheValue", iegVar2.i());
                    }
                }
                return arrayList;
            case 8:
                lyf lyfVar = (lyf) obj;
                ImmutableList immutableList = lyfVar.g;
                ArrayList arrayList2 = new ArrayList(immutableList.size());
                int i7 = 0;
                while (i7 < immutableList.size()) {
                    int iMin = Math.min(immutableList.size() - i7, 50);
                    StringBuilder sb = new StringBuilder("cache_account = ? AND cache_play_country = ? AND cache_locale = ? AND cache_last_update_sec > ? AND (cache_expiration_sec > ? OR cache_persistent = 1) AND (");
                    int i8 = 0;
                    while (i8 < iMin) {
                        sb.append(i8 == 0 ? "" : " OR ");
                        sb.append("(cache_type = ? AND cache_key = ?)");
                        i8++;
                    }
                    sb.append(")");
                    String string = sb.toString();
                    ImmutableList<lyc> immutableListSubList = immutableList.subList(i7, iMin + i7);
                    int size = immutableListSubList.size();
                    ieg iegVar3 = lyfVar.a;
                    String[] strArr = new String[size + size + i3];
                    strArr[0] = iegVar3.k() ? "_" : ((ksn) iegVar3.g()).a;
                    strArr[1] = lyfVar.b;
                    strArr[i4] = ksg.b(lyfVar.c);
                    strArr[3] = Long.toString(lyfVar.e);
                    strArr[4] = Long.toString(lyfVar.f);
                    int i9 = i3;
                    for (lyc lycVar : immutableListSubList) {
                        int i10 = i9 + 1;
                        strArr[i9] = Integer.toString(lycVar.a);
                        i9 += i4;
                        strArr[i10] = lycVar.b;
                    }
                    Cursor cursorQuery = ((lyz) this.b).b().query("cached_items", lyk.a, string, strArr, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            int i11 = cursorQuery.getInt(0);
                            String string2 = cursorQuery.getString(1);
                            try {
                                byte[] blob = cursorQuery.getBlob(i4);
                                i = i4;
                                try {
                                    vuc vucVarP = vuc.p(kzw.a, blob, 0, blob.length, vtp.a());
                                    vuc.B(vucVarP);
                                    arrayList2.add(new lyj(new lyc(i11, string2), (kzw) vucVarP, cursorQuery.getLong(3), cursorQuery.getLong(4)));
                                } catch (vuq e3) {
                                    e = e3;
                                    krd.d(a.cr(string2, "failed to parse item: "), e);
                                    i4 = i;
                                }
                            } catch (vuq e4) {
                                e = e4;
                                i = i4;
                            }
                            i4 = i;
                        } finally {
                        }
                    }
                    int i12 = i4;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    i7 += 50;
                    i4 = i12;
                    i3 = 5;
                }
                return arrayList2;
            case 9:
                return (ieg) this.b.b(((lyj) obj).b);
            case 10:
                new lxx((String) this.b);
                kuc kucVar = ((lyo) obj).j;
                throw null;
            case 11:
                String string3 = ((Cursor) obj).getString(0);
                xay xayVar = (xay) this.b;
                String strI = ktc.i(xayVar, string3);
                krf.c(strI);
                return new kth(xayVar.s, string3, strI);
            case 12:
                return ((lzh) this.b).a(obj);
            case 13:
                ieg iegVar4 = ((mfq) obj).b;
                if (iegVar4.k()) {
                    iegVar4.p();
                    return iegVar4;
                }
                try {
                    return ieg.f(this.b.f((byte[]) iegVar4.g()));
                } catch (vuq e5) {
                    return ieg.b(e5);
                }
            case 14:
                lzv lzvVar = (lzv) obj;
                lxx lxxVar2 = new lxx((String) this.b);
                lxxVar2.e(lzvVar);
                lxxVar2.c = lzvVar.f;
                return mfp.a(lxxVar2.a());
            case 15:
                mag magVar = (mag) obj;
                lxx lxxVar3 = new lxx((String) this.b);
                int i13 = magVar.j;
                lxxVar3.e(magVar);
                lxxVar3.c = magVar.f;
                lxxVar3.c("feed", Integer.toString(7));
                int i14 = magVar.l;
                lxxVar3.c("structure", Integer.toString(2));
                lxxVar3.d("genres", magVar.q);
                lxxVar3.b(magVar.k);
                String str2 = magVar.m;
                if (!TextUtils.isEmpty(str2)) {
                    lxxVar3.c("cat", str2);
                }
                int i15 = magVar.s;
                String str3 = magVar.o;
                if (!TextUtils.isEmpty(str3)) {
                    lxxVar3.c("tagdbid", str3);
                }
                Iterator it = magVar.r.iterator();
                while (it.hasNext()) {
                    lxxVar3.c("types", Integer.toString(((Integer) it.next()).intValue()));
                }
                lxxVar3.d("stags", magVar.p);
                return mfp.a(lxxVar3.a());
            case 16:
                xbq xbqVar = ((xbh) obj).b;
                if (xbqVar == null) {
                    xbqVar = xbq.a;
                }
                return this.b.b(new lct(xbqVar, new lbu(ieg.a)));
            case 17:
                mee meeVar = (mee) obj;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    this.b.execute(new lik(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]), meeVar, 14, bArr));
                    return ieg.f(parcelFileDescriptorArrCreatePipe[0]);
                } catch (IOException e6) {
                    return ieg.b(new mfh(e6));
                }
            case 18:
                mfq mfqVar = (mfq) obj;
                if (mfqVar.a == 304) {
                    return ieg.f(mfo.a);
                }
                return ((ieg) this.b.b(mfqVar)).e(new lxt(mfqVar, 18));
            default:
                try {
                    return ieg.f(new String((byte[]) obj, (String) ((ieg) this.b).c(mfq.c).h("ISO-8859-1")));
                } catch (UnsupportedEncodingException e7) {
                    return ieg.b(e7);
                }
        }
    }

    public lbj(String str, int i) {
        this.a = i;
        mew mewVar = new mew(str);
        mewVar.i("asset");
        mewVar.i("list");
        this.b = mewVar.a();
    }

    public lbj(String str, int i, byte[] bArr) {
        this.a = i;
        mew mewVar = new mew(str);
        mewVar.i("collection");
        this.b = mewVar.a();
    }

    public lbj(String str, int i, char[] cArr) {
        this.a = i;
        mew mewVar = new mew(str);
        mewVar.i("promotion");
        krf.a(mew.g("list", 0, 4), "Invalid segment %s", "list");
        mewVar.d("list");
        this.b = mewVar.a();
    }

    public lbj(String str, int i, short[] sArr) {
        this.a = i;
        mew mewVar = new mew(str);
        mewVar.i("recommendation");
        mewVar.i("feed");
        this.b = mewVar.a();
    }
}
