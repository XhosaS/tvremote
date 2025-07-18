package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j$.util.DesugarCollections;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gri {
    public xna a;
    public boolean b;
    public zyu c;
    public final jam d;
    private final PackageManager e;
    private final gyh f;

    public gri(gyh gyhVar, jam jamVar, PackageManager packageManager) {
        jamVar.getClass();
        this.f = gyhVar;
        this.d = jamVar;
        this.e = packageManager;
        xna xnaVar = xna.a;
        this.a = xnf.a(new xmz());
        zyu zyuVar = new zyu();
        xhe xheVar = xhe.a;
        zyuVar.p(xkn.a(new xhb()));
        this.c = zyuVar;
    }

    public final xhe a(String str, String str2) {
        int iA;
        xjr xjrVar = xjr.a;
        xjq xjqVar = new xjq();
        if ((xjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjqVar.y();
        }
        xjr xjrVar2 = (xjr) xjqVar.b;
        xjrVar2.b |= 1;
        xjrVar2.c = "media_on_device_lookup_args";
        xjr xjrVarA = xnv.a(xjqVar);
        if (str != null && str.length() != 0) {
            xjq xjqVar2 = new xjq();
            xjqVar2.B(xjrVarA);
            xjp xjpVar = xjp.a;
            xnu xnuVar = new xnu(new xjo());
            xjo xjoVar = xnuVar.a;
            if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xjoVar.y();
            }
            xjp xjpVar2 = (xjp) xjoVar.b;
            xjpVar2.b |= 1;
            xjpVar2.c = "assistant.api.client_op.MediaOnDeviceLookupOpResult";
            xna xnaVar = xna.a;
            xmz xmzVar = new xmz();
            DesugarCollections.unmodifiableList(((xna) xmzVar.b).b).getClass();
            xne xneVar = xne.a;
            xnd xndVar = new xnd();
            xbg xbgVar = xbg.a;
            xbf xbfVar = new xbf();
            xaq xaqVar = xaq.a;
            xap xapVar = new xap();
            if (str2 == null) {
                str2 = "";
            }
            xah.b(str2, xapVar);
            xah.c(str, xapVar);
            xaq xaqVarA = xah.a(xapVar);
            if ((xbfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xbfVar.y();
            }
            xbg xbgVar2 = (xbg) xbfVar.b;
            xbgVar2.c = xaqVarA;
            xbgVar2.b = 1;
            xbg xbgVarA = xao.a(xbfVar);
            if ((xndVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xndVar.y();
            }
            xne xneVar2 = (xne) xndVar.b;
            xneVar2.c = xbgVarA;
            xneVar2.b |= 1;
            abxd abxdVarV = xndVar.v();
            abxdVarV.getClass();
            xmzVar.a((xne) abxdVarV);
            xna xnaVarA = xnf.a(xmzVar);
            try {
                int i = xnaVarA.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(xnaVarA.getClass()).a(xnaVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(xnaVarA.getClass()).a(xnaVarA);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        xnaVarA.memoizedSerializedSize = (xnaVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                abvo abvoVar = abvo.b;
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(xnaVarA.getClass()).m(xnaVarA, abwa.a(abvwVar));
                xnuVar.b(abvk.a(abvwVar, bArr));
                xjp xjpVarA = xnuVar.a();
                if ((xjqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xjqVar2.y();
                }
                xjr xjrVar3 = (xjr) xjqVar2.b;
                xjrVar3.d = xjpVarA;
                xjrVar3.b |= 2;
                xjrVarA = xnv.a(xjqVar2);
            } catch (IOException e) {
                throw new RuntimeException(a.x(xnaVarA, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
            }
        }
        xhe xheVar = xhe.a;
        xhb xhbVar = new xhb();
        xjv xjvVar = xjv.a;
        xjs xjsVar = new xjs();
        xnw.b(xju.NOT_FOUND, xjsVar);
        xjv xjvVarA = xnw.a(xjsVar);
        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhbVar.y();
        }
        xhe xheVar2 = (xhe) xhbVar.b;
        xheVar2.c = xjvVarA;
        xheVar2.b |= 1;
        xhd xhdVar = xhd.a;
        xhc xhcVar = new xhc();
        DesugarCollections.unmodifiableList(((xhd) xhcVar.b).b).getClass();
        xhcVar.a(xjrVarA);
        xhd xhdVarA = xko.a(xhcVar);
        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhbVar.y();
        }
        xhe xheVar3 = (xhe) xhbVar.b;
        xheVar3.d = xhdVarA;
        xheVar3.b |= 2;
        return xkn.a(xhbVar);
    }

    public final xhe b(xna xnaVar) {
        int iA;
        xjr xjrVar = xjr.a;
        xjq xjqVar = new xjq();
        if ((xjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjqVar.y();
        }
        xjr xjrVar2 = (xjr) xjqVar.b;
        xjrVar2.b |= 1;
        xjrVar2.c = "media_on_device_lookup_args";
        xjp xjpVar = xjp.a;
        xnu xnuVar = new xnu(new xjo());
        xjo xjoVar = xnuVar.a;
        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjoVar.y();
        }
        xjp xjpVar2 = (xjp) xjoVar.b;
        xjpVar2.b |= 1;
        xjpVar2.c = "assistant.api.client_op.MediaOnDeviceLookupOpResult";
        try {
            int i = xnaVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xnaVar.getClass()).a(xnaVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xnaVar.getClass()).a(xnaVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xnaVar.memoizedSerializedSize = (xnaVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xnaVar.getClass()).m(xnaVar, abwa.a(abvwVar));
            xnuVar.b(abvk.a(abvwVar, bArr));
            xjp xjpVarA = xnuVar.a();
            if ((xjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xjqVar.y();
            }
            xjr xjrVar3 = (xjr) xjqVar.b;
            xjrVar3.d = xjpVarA;
            xjrVar3.b |= 2;
            xjr xjrVarA = xnv.a(xjqVar);
            xhe xheVar = xhe.a;
            xhb xhbVar = new xhb();
            xjv xjvVar = xjv.a;
            xjs xjsVar = new xjs();
            xnw.b(xju.OK, xjsVar);
            xjv xjvVarA = xnw.a(xjsVar);
            if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhbVar.y();
            }
            xhe xheVar2 = (xhe) xhbVar.b;
            xheVar2.c = xjvVarA;
            xheVar2.b |= 1;
            xhd xhdVar = xhd.a;
            xhc xhcVar = new xhc();
            DesugarCollections.unmodifiableList(((xhd) xhcVar.b).b).getClass();
            xhcVar.a(xjrVarA);
            xhd xhdVarA = xko.a(xhcVar);
            if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhbVar.y();
            }
            xhe xheVar3 = (xhe) xhbVar.b;
            xheVar3.d = xhdVarA;
            xheVar3.b |= 2;
            return xkn.a(xhbVar);
        } catch (IOException e) {
            throw new RuntimeException(a.u(xnaVar, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final String c(String str) throws PackageManager.NameNotFoundException {
        CharSequence charSequenceLoadLabel;
        try {
            PackageManager packageManager = this.e;
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            packageInfo.getClass();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String string = null;
            if (applicationInfo != null && (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) != null) {
                string = charSequenceLoadLabel.toString();
            }
            return string == null ? "" : string;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final void d(String str, String str2, Intent intent) {
        xne xneVar = xne.a;
        xnd xndVar = new xnd();
        if (str2 != null) {
            xbg xbgVar = xbg.a;
            xbf xbfVar = new xbf();
            xaq xaqVar = xaq.a;
            xap xapVar = new xap();
            xah.b(c(str2), xapVar);
            xah.c(str2, xapVar);
            xaq xaqVarA = xah.a(xapVar);
            if ((xbfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xbfVar.y();
            }
            xbg xbgVar2 = (xbg) xbfVar.b;
            xbgVar2.c = xaqVarA;
            xbgVar2.b = 1;
            xbg xbgVarA = xao.a(xbfVar);
            if ((xndVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xndVar.y();
            }
            xne xneVar2 = (xne) xndVar.b;
            xneVar2.c = xbgVarA;
            xneVar2.b |= 1;
        }
        xnc xncVar = xnc.a;
        xnb xnbVar = new xnb();
        xmk xmkVar = xmk.a;
        xmh xmhVar = new xmh();
        if ((xmhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xmhVar.y();
        }
        xmk xmkVar2 = (xmk) xmhVar.b;
        xmkVar2.b |= 1;
        xmkVar2.e = str;
        xmk xmkVarA = xlu.a(xmhVar);
        if ((xnbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xnbVar.y();
        }
        xnc xncVar2 = (xnc) xnbVar.b;
        xncVar2.c = xmkVarA;
        xncVar2.b |= 4;
        abxd abxdVarV = xnbVar.v();
        abxdVarV.getClass();
        xnc xncVar3 = (xnc) abxdVarV;
        if ((xndVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xndVar.y();
        }
        xne xneVar3 = (xne) xndVar.b;
        abxs abxsVar = xneVar3.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xneVar3.e = abxsVar.d(size + size);
        }
        xneVar3.e.add(xncVar3);
        if (intent != null) {
            intent.putExtra("android.intent.extra.START_PLAYBACK", true);
            xjp xjpVar = xjp.a;
            xnu xnuVar = new xnu(new xjo());
            xjo xjoVar = xnuVar.a;
            if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xjoVar.y();
            }
            xjp xjpVar2 = (xjp) xjoVar.b;
            xjpVar2.b = 1 | xjpVar2.b;
            xjpVar2.c = "marshall_android_intent";
            xnuVar.b(fen.a(intent));
            xjp xjpVarA = xnuVar.a();
            if ((Integer.MIN_VALUE & xndVar.b.memoizedSerializedSize) == 0) {
                xndVar.y();
            }
            xne xneVar4 = (xne) xndVar.b;
            abxs abxsVar2 = xneVar4.d;
            if (!abxsVar2.c()) {
                int size2 = abxsVar2.size();
                xneVar4.d = abxsVar2.d(size2 + size2);
            }
            xneVar4.d.add(xjpVarA);
            gyh gyhVar = this.f;
            if (gyhVar.b()) {
                String strA = lwy.a(gyhVar.a, "aah:blacklisted_play_intent_cacheable_providers", "");
                strA.getClass();
                if (!agqq.D(agqq.A(agyv.t(strA, new String[]{","})), str2)) {
                    jam jamVar = this.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strA2 = jamVar.a(str, str2);
                    if (strA2.length() > 0) {
                        jamVar.a.put(strA2, intent);
                    } else {
                        intent.toString();
                    }
                }
            }
        }
        xna xnaVar = this.a;
        xmz xmzVar = new xmz();
        xmzVar.B(xnaVar);
        DesugarCollections.unmodifiableList(((xna) xmzVar.b).b).getClass();
        abxd abxdVarV2 = xndVar.v();
        abxdVarV2.getClass();
        xmzVar.a((xne) abxdVarV2);
        this.a = xnf.a(xmzVar);
    }

    public final void e() {
        if (!this.b) {
            f();
        }
        this.c.p(b(this.a));
    }

    public final void f() {
        this.c = new zyu();
        this.b = true;
    }
}
