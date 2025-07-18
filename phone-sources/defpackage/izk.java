package defpackage;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.MaterialChipActivity;
import com.google.android.apps.googletv.app.internal.MaterialDialogActivity;
import com.google.android.apps.googletv.app.internal.MaterialSnackbarActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class izk implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ izk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cr supportFragmentManager;
        switch (this.b) {
            case 0:
                Toast.makeText((MaterialChipActivity) this.a, "Clicked Action Chip", 0).show();
                break;
            case 1:
                MaterialChipActivity.$r8$lambda$aeWAH18jIQsgi4ahINsAH2fbyCg((MaterialChipActivity) this.a, view);
                break;
            case 2:
                Toast.makeText((MaterialChipActivity) this.a, "Clicked Input Chip close icon", 0).show();
                break;
            case 3:
                MaterialDialogActivity.$r8$lambda$xkHUDsOwE5iIiOU3IIUeEpi0Osg((MaterialDialogActivity) this.a, view);
                break;
            case 4:
                MaterialDialogActivity.$r8$lambda$21PYdayWrtzZBVKthgbS6YZMZnI((MaterialDialogActivity) this.a, view);
                break;
            case 5:
                MaterialDialogActivity.$r8$lambda$HMetXAVEHI55f2_nkX_6aAZ1a2U((MaterialDialogActivity) this.a, view);
                break;
            case 6:
                MaterialDialogActivity.$r8$lambda$T1FrpEB0JnNp48ZbRlFmy7bdMNI((MaterialDialogActivity) this.a, view);
                break;
            case 7:
                MaterialDialogActivity.m107$r8$lambda$v8ADS7aSaK8CUPMyZVv2uWj5oQ((MaterialDialogActivity) this.a, view);
                break;
            case 8:
                Toast.makeText((MaterialSnackbarActivity) this.a, "Clicked Action", 0).show();
                break;
            case 9:
                MaterialSnackbarActivity.$r8$lambda$Zcoqi4peWlDzeg9iZ7yzFCfzxYA((MaterialSnackbarActivity) this.a, view);
                break;
            case 10:
                MaterialSnackbarActivity.$r8$lambda$u3Qp3BAt4Vgp5u6PHYuSS6Gn66o((MaterialSnackbarActivity) this.a, view);
                break;
            case 11:
                by activity = ((bv) this.a).getActivity();
                if (activity != null) {
                    activity.finish();
                    break;
                }
                break;
            case 12:
                by byVarRequireActivity = ((bv) this.a).requireActivity();
                AppCompatActivity appCompatActivity = byVarRequireActivity instanceof AppCompatActivity ? (AppCompatActivity) byVarRequireActivity : null;
                ActionBar supportActionBar = appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null;
                if (supportActionBar != null) {
                    if (!supportActionBar.isShowing()) {
                        supportActionBar.show();
                        break;
                    } else {
                        supportActionBar.hide();
                        break;
                    }
                }
                break;
            case 13:
                by activity2 = ((bv) this.a).getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    break;
                }
                break;
            case 14:
                bv bvVar = (bv) this.a;
                by activity3 = bvVar.getActivity();
                if (activity3 != null && (supportFragmentManager = activity3.getSupportFragmentManager()) != null) {
                    supportFragmentManager.M();
                }
                by activity4 = bvVar.getActivity();
                if (activity4 != null) {
                    activity4.recreate();
                    break;
                }
                break;
            case 15:
                ((jcm) this.a).t.b();
                break;
            case 16:
                ((jdd) this.a).aa.b();
                break;
            case 17:
                ((jhx) this.a).i(false);
                break;
            case 18:
                ((jiy) this.a).i(false);
                break;
            case 19:
                ((jry) this.a).m(false);
                break;
            default:
                ((jry) this.a).k(false);
                break;
        }
    }
}
