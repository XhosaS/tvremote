package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pha extends bv implements pqh {
    private static final tvn f = tvn.n("GnpSdk");
    public pgz a = null;
    public boolean b;
    public pkg c;
    public kwy d;
    public kwy e;
    private boolean g;

    public final void a() {
        cr fragmentManager;
        if (getActivity() == null || getActivity().isFinishing() || !isAdded() || isRemoving() || (fragmentManager = getFragmentManager()) == null) {
            return;
        }
        at atVar = new at(fragmentManager);
        atVar.m(this);
        atVar.l();
    }

    @Override // defpackage.pqh
    public final tbk b() {
        pgz pgzVar = this.a;
        if (pgzVar != null) {
            return pgzVar.d;
        }
        return null;
    }

    @Override // defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            ((owv) ((yfo) qhj.a(context).ab().get(pha.class)).b()).a(this);
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) f.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightFragment", "onAttach", 'r', "FeatureHighlightFragment.java")).s("Failed to inject members.");
        }
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("showing")) {
            z = true;
        }
        this.g = z;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_feature_highlight_fragment, viewGroup);
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("showing", this.g);
        this.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0250 A[Catch: pgf -> 0x04b3, TryCatch #0 {pgf -> 0x04b3, blocks: (B:26:0x008d, B:28:0x00af, B:30:0x00b4, B:32:0x00b8, B:33:0x00ba, B:34:0x00c0, B:36:0x00c6, B:38:0x00ca, B:40:0x00ce, B:41:0x00d0, B:43:0x00d8, B:44:0x00da, B:45:0x00e2, B:47:0x00e6, B:48:0x00e8, B:49:0x00ee, B:51:0x00f4, B:53:0x00f8, B:54:0x00fa, B:55:0x0100, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x0113, B:63:0x0119, B:65:0x011d, B:66:0x011f, B:67:0x0126, B:69:0x012c, B:71:0x0130, B:72:0x0132, B:118:0x01fb, B:120:0x0201, B:122:0x0209, B:123:0x020b, B:125:0x0211, B:127:0x0216, B:126:0x0214, B:128:0x0218, B:130:0x021e, B:131:0x0222, B:133:0x0226, B:135:0x022a, B:136:0x022c, B:138:0x0236, B:139:0x0238, B:141:0x023e, B:143:0x0248, B:144:0x024a, B:146:0x0250, B:148:0x025a, B:150:0x0260, B:152:0x0264, B:153:0x0266, B:160:0x027b, B:162:0x0284, B:164:0x0288, B:165:0x028a, B:154:0x026b, B:156:0x0271, B:158:0x0275, B:159:0x0277, B:168:0x0296, B:169:0x02b1, B:171:0x02bb, B:172:0x02bd, B:174:0x02c1, B:175:0x02c3, B:177:0x02ce, B:178:0x02d0, B:180:0x02dd, B:182:0x02e1, B:183:0x02e3, B:184:0x02ea, B:186:0x02f0, B:188:0x02f4, B:189:0x02f6, B:190:0x02fd, B:75:0x013e, B:77:0x016c, B:78:0x0170, B:80:0x017a, B:81:0x017c, B:83:0x0180, B:84:0x0182, B:86:0x018d, B:87:0x018f, B:89:0x019a, B:90:0x019c, B:92:0x01a8, B:94:0x01ac, B:95:0x01ae, B:96:0x01b4, B:98:0x01be, B:99:0x01c0, B:101:0x01c6, B:103:0x01ca, B:104:0x01cc, B:106:0x01d4, B:107:0x01d6, B:112:0x01ea, B:114:0x01ef, B:116:0x01f3, B:117:0x01f5, B:108:0x01de, B:110:0x01e2, B:111:0x01e4), top: B:221:0x008d }] */
    @Override // defpackage.bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pha.onStart():void");
    }
}
