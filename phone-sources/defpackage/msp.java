package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class msp implements iej {
    final /* synthetic */ MediaInfo a;
    final /* synthetic */ nqj b;
    final /* synthetic */ msw c;
    final /* synthetic */ msr d;
    final /* synthetic */ kir e;

    public msp(msr msrVar, kir kirVar, MediaInfo mediaInfo, nqj nqjVar, msw mswVar) {
        this.e = kirVar;
        this.a = mediaInfo;
        this.b = nqjVar;
        this.c = mswVar;
        this.d = msrVar;
    }

    @Override // defpackage.iej
    public final void dM() {
        msr msrVar = this.d;
        boolean z = false;
        if (msrVar.j.k()) {
            mss mssVarA = mst.a();
            mssVarA.a(10001);
            mssVarA.a = String.format("Unable to get OAuth token for user: %s", msrVar.j.i().getMessage());
            mssVarA.b();
            return;
        }
        String str = (String) msrVar.j.g();
        Pattern pattern = ksh.a;
        boolean zBooleanValue = ((Boolean) msrVar.k.g()).booleanValue();
        if (((Boolean) xhx.a.et(((xhx) msrVar.g).b)).booleanValue() && msrVar.e.bR() && krh.isBingeWatchingEnabledInPreferences(msrVar.f)) {
            z = true;
        }
        nlh nlhVar = new nlh(this.a, null, true, -1L, 1.0d, null, new lfi(str, zBooleanValue, z).a(), null, null, null, null, 0L);
        final nqj nqjVar = this.b;
        nwx nwxVarI = nqjVar.i(nlhVar);
        final msw mswVar = this.c;
        nwxVarI.i(new nxd() { // from class: mso
            @Override // defpackage.nxd
            public final void a(nxc nxcVar) {
                nqd nqdVar = (nqd) nxcVar;
                if (nqdVar.e().b()) {
                    msw mswVar2 = mswVar;
                    msp mspVar = this.a;
                    ieg iegVar = mswVar2.c;
                    String str2 = iegVar.m() ? ((ksy) iegVar.g()).b : null;
                    ksy ksyVar = mswVar2.e;
                    msr msrVar2 = mspVar.d;
                    nqj nqjVar2 = nqjVar;
                    kdh kdhVar = new kdh(new jzs(msrVar2.a.a(), ksyVar.b, str2, msrVar2.f));
                    List list = nqjVar2.e() != null ? nqjVar2.e().e : null;
                    if (list != null) {
                        ArrayList arrayList = (nqjVar2.h() == null || nqjVar2.h().k == null) ? new ArrayList() : new ArrayList(sfy.T(nqjVar2.h().k));
                        HashMap map = new HashMap();
                        Iterator it = list.iterator();
                        boolean z2 = false;
                        while (true) {
                            if (it.hasNext()) {
                                MediaTrack mediaTrack = (MediaTrack) it.next();
                                int i = mediaTrack.b;
                                if (i == 2 && Locale.getDefault().getLanguage().equals(mediaTrack.f)) {
                                    z2 = true;
                                }
                                if (i == 1) {
                                    kwx kwxVarP = kdw.p(mediaTrack);
                                    Long lValueOf = Long.valueOf(mediaTrack.a);
                                    map.put(kwxVarP, lValueOf);
                                    if (arrayList.contains(lValueOf)) {
                                        break;
                                    }
                                }
                            } else {
                                kwx kwxVarL = kdhVar.l(ImmutableList.copyOf((Collection) map.keySet()), z2, new llw(new Bundle()));
                                if (kwxVarL != null) {
                                    arrayList.add((Long) map.get(kwxVarL));
                                    long[] jArrV = sfy.V(arrayList);
                                    Arrays.sort(jArrV);
                                    nqjVar2.E(jArrV);
                                }
                            }
                        }
                    }
                }
                msr.b();
                mss mssVarA2 = mst.a();
                mssVarA2.a(true != nqdVar.e().b() ? WVMediaCrypto.TYPE : 0);
                mssVarA2.b = nqdVar;
                mssVarA2.b();
            }
        });
    }
}
