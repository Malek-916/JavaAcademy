import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component'; 
import { AllNotaComponent } from './all-nota/all-nota.component'; 
import { DeleteComponent } from './delete/delete.component'; 
import { ModificaComponent } from './modifica/modifica.component'; 
import { RicercaComponent } from './ricerca/ricerca.component'; 

export const AppRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'getAll', component: AllNotaComponent },
  { path: 'delete', component: DeleteComponent },
  { path: 'modifica', component: ModificaComponent },
  { path: 'ricerca', component: RicercaComponent }
];