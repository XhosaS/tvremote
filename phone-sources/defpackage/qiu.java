package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qiu implements vuk {
    private final /* synthetic */ int a;

    public qiu(int i) {
        this.a = i;
    }

    @Override // defpackage.vuk
    public final /* synthetic */ Object a(int i) {
        vac vacVar;
        switch (this.a) {
            case 0:
                vmd vmdVarB = vmd.b(i);
                return vmdVarB == null ? vmd.REGISTRATION_REASON_UNSPECIFIED : vmdVarB;
            case 1:
                kzb kzbVarB = kzb.b(i);
                return kzbVarB == null ? kzb.UNRECOGNIZED : kzbVarB;
            case 2:
                vlo vloVarB = vlo.b(i);
                return vloVarB == null ? vlo.FETCH_REASON_UNSPECIFIED : vloVarB;
            case 3:
                vmd vmdVarB2 = vmd.b(i);
                return vmdVarB2 == null ? vmd.REGISTRATION_REASON_UNSPECIFIED : vmdVarB2;
            case 4:
                uis uisVarB = uis.b(i);
                return uisVarB == null ? uis.UNKNOWN : uisVarB;
            case 5:
                uis uisVarB2 = uis.b(i);
                return uisVarB2 == null ? uis.UNKNOWN : uisVarB2;
            case 6:
                tnt tntVarB = tnt.b(i);
                return tntVarB == null ? tnt.NONE : tntVarB;
            case 7:
                tpn tpnVarB = tpn.b(i);
                return tpnVarB == null ? tpn.OWNER_USER_TYPE_UNKNOWN : tpnVarB;
            case 8:
                uwz uwzVarB = uwz.b(i);
                return uwzVarB == null ? uwz.TARGETING_FAILED_REASON_UNKNOWN : uwzVarB;
            case 9:
                uwt uwtVarB = uwt.b(i);
                return uwtVarB == null ? uwt.CONDITION_UNKNOWN : uwtVarB;
            case 10:
                uvu uvuVarB = uvu.b(i);
                return uvuVarB == null ? uvu.ANDROID_PERMISSION_TYPE_UNSPECIFIED : uvuVarB;
            case 11:
                wet wetVarB = wet.b(i);
                return wetVarB == null ? wet.DAY_OF_WEEK_UNSPECIFIED : wetVarB;
            case 12:
                switch (i) {
                    case 0:
                        vacVar = vac.TAG_UNSPECIFIED;
                        break;
                    case 1:
                        vacVar = vac.DOWNLOADED;
                        break;
                    case 2:
                        vacVar = vac.RENTED;
                        break;
                    case 3:
                        vacVar = vac.FAMILY_LIBRARY_SHARING;
                        break;
                    case 4:
                        vacVar = vac.NOT_FAMILY_LIBRARY_SHARING;
                        break;
                    case 5:
                        vacVar = vac.QUALITY_SD;
                        break;
                    case 6:
                        vacVar = vac.QUALITY_HD;
                        break;
                    case 7:
                        vacVar = vac.QUALITY_UHD;
                        break;
                    case 8:
                        vacVar = vac.UPGRADED_TO_4K;
                        break;
                    default:
                        vacVar = null;
                        break;
                }
                return vacVar == null ? vac.UNRECOGNIZED : vacVar;
            case 13:
                vak vakVarB = vak.b(i);
                return vakVarB == null ? vak.UNRECOGNIZED : vakVarB;
            case 14:
                vak vakVarB2 = vak.b(i);
                return vakVarB2 == null ? vak.UNRECOGNIZED : vakVarB2;
            case 15:
                vlx vlxVarB = vlx.b(i);
                return vlxVarB == null ? vlx.UNKNOWN : vlxVarB;
            case 16:
                vlx vlxVarB2 = vlx.b(i);
                return vlxVarB2 == null ? vlx.UNKNOWN : vlxVarB2;
            case 17:
                vll vllVarB = vll.b(i);
                return vllVarB == null ? vll.DELETION_STATUS_UNKNOWN : vllVarB;
            case 18:
                wet wetVarB2 = wet.b(i);
                return wetVarB2 == null ? wet.DAY_OF_WEEK_UNSPECIFIED : wetVarB2;
            case 19:
                voc vocVarB = voc.b(i);
                return vocVarB == null ? voc.ANDROID_PERMISSION_TYPE_UNSPECIFIED : vocVarB;
            default:
                vak vakVarB3 = vak.b(i);
                return vakVarB3 == null ? vak.UNRECOGNIZED : vakVarB3;
        }
    }
}
