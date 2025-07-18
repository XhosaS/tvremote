package defpackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.android.apps.googletv.app.internal.BottomAppBarMaterialActivity;
import com.google.android.apps.googletv.app.internal.BottomSheetMaterialActivity;
import com.google.android.apps.googletv.app.internal.ButtonMaterialActivity;
import com.google.android.apps.googletv.app.internal.MaterialActivity;
import com.google.android.apps.googletv.app.internal.MaterialBottomNavigationActivity;
import com.google.android.apps.googletv.app.internal.MaterialCardActivity;
import com.google.android.apps.googletv.app.internal.MaterialChipActivity;
import com.google.android.apps.googletv.app.internal.MaterialDialogActivity;
import com.google.android.apps.googletv.app.internal.MaterialOverviewActivity;
import com.google.android.apps.googletv.app.internal.MaterialSelectionActivity;
import com.google.android.apps.googletv.app.internal.MaterialSnackbarActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ize implements View.OnClickListener {
    public final /* synthetic */ AppCompatActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ize(AppCompatActivity appCompatActivity, int i) {
        this.b = i;
        this.a = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                BottomSheetMaterialActivity.$r8$lambda$zDjriseCZR46LiGv3HPcNFfTFfI((BottomSheetMaterialActivity) this.a, view);
                break;
            case 1:
                BottomSheetMaterialActivity.$r8$lambda$kPrXsuR2RNOebCe0vF2k7Kw_iOc((BottomSheetMaterialActivity) this.a, view);
                break;
            case 2:
                ButtonMaterialActivity.$r8$lambda$4HPXg7sOfI4jLOiiKfdeuqbHfSw((ButtonMaterialActivity) this.a, view);
                break;
            case 3:
                ButtonMaterialActivity.$r8$lambda$umq6UL4giFRIYSlz4IW7e5u69ic((ButtonMaterialActivity) this.a, view);
                break;
            case 4:
                MaterialActivity materialActivity = (MaterialActivity) this.a;
                materialActivity.startActivity(new Intent(materialActivity, (Class<?>) MaterialDialogActivity.class));
                break;
            case 5:
                MaterialActivity materialActivity2 = (MaterialActivity) this.a;
                materialActivity2.startActivity(new Intent(materialActivity2, (Class<?>) MaterialSelectionActivity.class));
                break;
            case 6:
                MaterialActivity materialActivity3 = (MaterialActivity) this.a;
                materialActivity3.startActivity(new Intent(materialActivity3, (Class<?>) MaterialSnackbarActivity.class));
                break;
            case 7:
                MaterialActivity materialActivity4 = (MaterialActivity) this.a;
                materialActivity4.startActivity(new Intent(materialActivity4, (Class<?>) MaterialOverviewActivity.class));
                break;
            case 8:
                MaterialActivity.m95$r8$lambda$yBOJWaA2CNbrcXtIrzCMfX2nic((MaterialActivity) this.a, view);
                break;
            case 9:
                MaterialActivity.$r8$lambda$WuOVGYBLLDGhiavqOmtCqdPt50A((MaterialActivity) this.a, view);
                break;
            case 10:
                MaterialActivity materialActivity5 = (MaterialActivity) this.a;
                materialActivity5.startActivity(new Intent(materialActivity5, (Class<?>) BottomAppBarMaterialActivity.class));
                break;
            case 11:
                MaterialActivity materialActivity6 = (MaterialActivity) this.a;
                materialActivity6.startActivity(new Intent(materialActivity6, (Class<?>) MaterialBottomNavigationActivity.class));
                break;
            case 12:
                MaterialActivity materialActivity7 = (MaterialActivity) this.a;
                materialActivity7.startActivity(new Intent(materialActivity7, (Class<?>) BottomSheetMaterialActivity.class));
                break;
            case 13:
                MaterialActivity materialActivity8 = (MaterialActivity) this.a;
                materialActivity8.startActivity(new Intent(materialActivity8, (Class<?>) ButtonMaterialActivity.class));
                break;
            case 14:
                MaterialActivity materialActivity9 = (MaterialActivity) this.a;
                materialActivity9.startActivity(new Intent(materialActivity9, (Class<?>) MaterialChipActivity.class));
                break;
            case 15:
                MaterialActivity materialActivity10 = (MaterialActivity) this.a;
                materialActivity10.startActivity(new Intent(materialActivity10, (Class<?>) MaterialCardActivity.class));
                break;
            case 16:
                MaterialBottomNavigationActivity.m97$r8$lambda$yHr5245uHRv2wq2B672OxwGzI((MaterialBottomNavigationActivity) this.a, view);
                break;
            case 17:
                MaterialBottomNavigationActivity.$r8$lambda$proAF9B92IzjdvOoM1l_lo_vImg((MaterialBottomNavigationActivity) this.a, view);
                break;
            case 18:
                MaterialBottomNavigationActivity.$r8$lambda$_3cJRy2Xa0ymlIKPd1o1e0qjWP0((MaterialBottomNavigationActivity) this.a, view);
                break;
            case 19:
                MaterialBottomNavigationActivity.$r8$lambda$WPL_T4mRI3w1cUEX4MEs5sEudTM((MaterialBottomNavigationActivity) this.a, view);
                break;
            default:
                MaterialChipActivity.m99$r8$lambda$ZGQ7XM9v2Q2uouSpG8_POLUFZk((MaterialChipActivity) this.a, view);
                break;
        }
    }
}
