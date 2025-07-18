package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsp implements tsv {
    private final /* synthetic */ int a;

    public /* synthetic */ lsp(int i) {
        this.a = i;
    }

    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                int iOrdinal = ((vzq) obj).ordinal();
                return iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6;
            case 1:
                val valVar = ((vdv) obj).c;
                if (valVar == null) {
                    valVar = val.a;
                }
                return kgu.q(valVar, vak.DISTRIBUTOR);
            case 2:
                return ((vzq) obj).equals(vzq.HDR_DOLBY_VISION);
            case 3:
                return new vul(((vzn) obj).f, vzn.a).contains(vzm.CHANNELS_5_1);
            case 4:
                vak vakVar = vak.TYPE_UNSPECIFIED;
                vak vakVarB = vak.b(((val) obj).b);
                if (vakVarB == null) {
                    vakVarB = vak.UNRECOGNIZED;
                }
                return vakVar.equals(vakVarB);
            case 5:
                vak vakVar2 = vak.MOVIE;
                vak vakVarB2 = vak.b(((val) obj).b);
                if (vakVarB2 == null) {
                    vakVarB2 = vak.UNRECOGNIZED;
                }
                return vakVar2.equals(vakVarB2);
            case 6:
                vak vakVar3 = vak.BUNDLE;
                vak vakVarB3 = vak.b(((val) obj).b);
                if (vakVarB3 == null) {
                    vakVarB3 = vak.UNRECOGNIZED;
                }
                return vakVar3.equals(vakVarB3);
            case 7:
                vak vakVar4 = vak.ANDROID_APP;
                vak vakVarB4 = vak.b(((val) obj).b);
                if (vakVarB4 == null) {
                    vakVarB4 = vak.UNRECOGNIZED;
                }
                return vakVar4.equals(vakVarB4);
            case 8:
                vak vakVar5 = vak.EPISODE;
                vak vakVarB5 = vak.b(((val) obj).b);
                if (vakVarB5 == null) {
                    vakVarB5 = vak.UNRECOGNIZED;
                }
                return vakVar5.equals(vakVarB5);
            case 9:
                vak vakVar6 = vak.SEASON;
                vak vakVarB6 = vak.b(((val) obj).b);
                if (vakVarB6 == null) {
                    vakVarB6 = vak.UNRECOGNIZED;
                }
                return vakVar6.equals(vakVarB6);
            case 10:
                vak vakVar7 = vak.TRAILER;
                vak vakVarB7 = vak.b(((val) obj).b);
                if (vakVarB7 == null) {
                    vakVarB7 = vak.UNRECOGNIZED;
                }
                return vakVar7.equals(vakVarB7);
            case 11:
                return ((luc) obj).a != 0;
            case 12:
                return ((vaj) obj).b == 15;
            case 13:
                return ksy.v((ksy) obj);
            case 14:
                return "unpinned_clean_up".equals((String) obj);
            case 15:
                return ksy.x((ksy) obj);
            case 16:
                return ksy.t((ksy) obj);
            case 17:
                return ksy.v((ksy) obj);
            case 18:
                return ksy.w((ksy) obj);
            case 19:
                return "accounts_changed".equals((String) obj);
            default:
                return "upload_user_sentiments".equals((String) obj);
        }
    }
}
